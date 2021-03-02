import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			
			// Players/Map Size
			byte p = scanner.nextByte();
			short s = scanner.nextShort();
			
			if (p == 0 && s == 0) break;
			
			// Traps
			short[] t = new short[3];
			for (byte i = 0; i < 3; i++) {
				t[i] = scanner.nextShort();
			}
			
			// Game
			Game game = new Game(p, s, t);
			
			// Gameplay
			int n = scanner.nextInt();
			
			for (int i = 0; i < n; i++) {
				byte d1 = scanner.nextByte();
				byte d2 = scanner.nextByte();
				
				game.move(d1, d2);
			}
			
			System.out.println(game.getWinner());
		}
		
		scanner.close();
		
	}
	
}

class Game {
	
	short playerCount;
	short size;
	short[] traps;
	
	int turn;
	Player[] players;
	
	Game(byte p, short s, short[] t) {
		playerCount = p;
		size = s;
		traps = t;
		
		turn = 0;
		players = new Player[p];
		
		for (byte i = 0; i < p; i++) {
			players[i] = new Player();
		}
	}
	
	void move(byte d1, byte d2) {
		if (!players[turn].canMove) {
			players[turn].canMove = true;
			
			nextTurn();
			
			move(d1, d2);
		} else {
			players[turn].move((d1 + d2), traps);
			
			nextTurn();
		}
		
	}
	
	void nextTurn() {
		turn++;
		
		if (turn == playerCount) {
			turn = 0;
		}
	}
	
	int getWinner() {
		if (turn == 0) {
			return playerCount;
		}
		
		return turn;
	}
	
}

class Player {
	
	boolean canMove;
	short pos;
	
	Player() {
		canMove = true;
		pos = 0;
	}
	
	void move(int ammount, short[] traps) {
		pos += ammount;
		
		for (byte i = 0; i < 3; i++) {
			if (pos == traps[i]) {
				canMove = false;
			}
		}
	}
	
}
