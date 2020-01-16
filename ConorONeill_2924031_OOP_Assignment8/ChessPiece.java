/*
 * Assignment 08: Student.java
 *
 * Student name: Conor O'Neill
 * Student number: 2924031
 *
 */
class ChessPiece {
	public enum pieces {
		Pawn, Knight, Bishop, King, Rook, Queen;
		
		public String toString() {
			switch (this) {
			case Pawn:
				return "\033[mPawn\033[0m";
			case Knight:
				return "\033[mKnight\033[0m";
			case Bishop:
				return "\033[mBishop\033[0m";
			case King:
				return "\033[mKing\033[0m";
			case Rook:
				return "\033[mRook\033[0m";
			case Queen:
				return "\033[mQueen\033[0m";
			default:
				return "\033[3mUndefined\033[0m";
			}
		}
		
		public int value() {
			switch (this) {
			case Pawn:
				return 1;
			case Knight:
				return 3;
			case Bishop:
				return 3;
			case King:
				return 4;
			case Rook:
				return 5;
			case Queen:
				return 9;
			default:
				return 0;
			}
		}
	}
}
