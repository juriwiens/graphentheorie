public class CheckPath {

public static boolean checkPath(boolean[][] map, String path) {
        int l = path.length();		// Laenge des Weges
	int size = map.length;		// Groesse des Labyrinths sowohl in x- als auch in y-Richtung
	int x = 0;			// aktuelle x-Position des Robots (Zeile)
	int y = 0;			// aktuelle y-Position des Robots (Spalte)
	char move;			// einzelne Bewegung des Roboters

	for (int i=0 ; i<l ; i++) {	// Laufe den Weg des Roboters ab.
	    move = path.charAt(i);	// Bewegung, die der Roboter ausfuehren soll
	    switch (move) {
	        case 'd' : x = x+1; break;	// nach unten (down) ==> Zeile + 1
		case 'u' : x = x-1; break;	// nach oben (up) ==> Zeile - 1
		case 'r' : y = y+1; break;	// nach rechts (right) ==> Spalte + 1
		case 'l' : y = y-1; break;	// nach links (left) ==> Spalte - 1
		default : return false;		// alle anderen Zeichen duerfen hier nicht auftreten
	    }
	    				// Wenn der Roboter aus dem Labyrinth oder
					// gegen einen Felsen gelaufen ist, dann ist der Weg
					// ungueltig.
	    if (x<0 || x>=size || y<0 || y>=size || map[x][y]) { 
	        return false;
	    }
	}
					// Wenn man hier angekommen ist, dann ist der Weg gueltig.
	return x==size-1 && y==size-1;	// Pruefe nun, ob die Zielposition erreicht ist.
    }
}
