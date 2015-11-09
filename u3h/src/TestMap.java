public class TestMap {
  
public static boolean[][] testmap0 = {
	{ false, false, false, false, false, false, false, false, false, false},
	{ false, false, false, false, false, false, false, false, false, false},
	{ false, false, false, false, false, false, false, false,  true, false},
	{ false, false, false, false, false, false,  true,  true, false, false},
	{ false, false, false, false, false, false, false, false, false, false},
	{ false, false, false, false, false, false, false, false, false, false},
	{  true, false, false, false, false, false, false, false,  true, false},
	{ false, false, false, false, false, false, false, false,  true, false},
	{ false, false, false, false, false, false, false, false, false, false},
	{ false, false, false, false, false,  true, false, false, false, false}
    };
    /* testmap0
    +----------+
    |          |
    |          |
    |        X |
    |      XX  |
    |          |
    |          |
    |X       X |
    |        X |
    |          |
    |     X    |
    +----------+
    */

    public static boolean[][] testmap1 = {
	{ false, false, false, false, false, false, false, false, false, false},
	{ false, false, false, false, false, false, false, false, false, false},
	{ false,  true, false, false, false, false, false, false, false, false},
	{ false, false,  true, false, false, false,  true, false, false, false},
	{ false, false, false, false,  true, false, false, false, false, false},
	{ false, false, false,  true, false, false, false,  true, false, false},
	{ false, false, false, false,  true, false, false, false, false,  true},
	{ false, false, false, false, false, false, false, false,  true, false},
	{ false, false, false, false, false, false, false, false, false, false},
	{ false, false, false,  true,  true, false,  true, false, false, false}
    };
    /* testmap1
    +----------+
    |          |
    |          |
    | X        |
    |  X   X   |
    |    X     |
    |   X   X  |
    |    X    X|
    |        X |
    |          |
    |   XX X   |
    +----------+
    */

    public static boolean[][] testmap2 = {
	{ false, false, false, false,  true,  true, false, false,  true, false},
	{ false, false, false, false, false, false, false,  true, false, false},
	{ false, false,  true, false, false,  true, false,  true, false, false},
	{ false, false,  true,  true, false, false,  true, false,  true, false},
	{  true,  true, false, false, false, false,  true, false, false, false},
	{ false, false, false, false,  true, false,  true, false,  true, false},
	{ false, false,  true, false, false, false, false,  true, false, false},
	{ false, false, false, false, false,  true, false,  true, false, false},
	{ false, false, false, false, false, false,  true, false, false, false},
	{ false, false, false, false, false, false, false, false, false, false}
    };
    /* testmap2
    +----------+
    |    XX  X |
    |       X  |
    |  X  X X  |
    |  XX  X X |
    |XX    X   |
    |    X X X |
    |  X    X  |
    |     X X  |
    |      X   |
    |          |
    +----------+
    */

	public static boolean[][] testmap3 = {
			{ false, false, false, false,  true,  true, false, false,  true, false},
			{ false, false, false, false, false, false, false,  true, false, false},
			{ false, false,  true, false, false,  true, false,  true, false, false},
			{ false, false,  true,  true, false, false,  true, false,  true, false},
			{  true,  true, false, false, false, false,  true, false, false, false},
			{ false, false, false, false,  true, false,  true, false,  true, false},
			{ false, false,  true, false, false, false, false,  true, false, false},
			{ false, false, false, false, false,  true, false,  true, false, false},
			{ false, false, false, false, false, false,  true, false, false, false},
			{ false, false, false, false, false, false, true, false, false, false}
	};
}

