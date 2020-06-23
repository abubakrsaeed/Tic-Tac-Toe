public class BoardFrame {

    private char[][] state = {
            { '-', '-', '-' },
            { '-', '-', '-' },
            { '-', '-', '-' }
    };
    private int turn = 0;
    private char player = '1';

    public char getWinner() {
        char winner = 0;
        for (int i = 0; i < 3; i++) {
            if (state[i][0] != '-' && state[i][0] == state[i][1] && state[i][0] == state[i][2]) {
                winner = state[i][0];
                return winner;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (state[0][i] != '-' && state[0][i] == state[1][i] && state[0][i] == state[2][i]) {
                winner = state[0][i];
                return winner;
            }
        }

        if (state[0][0] != '-' && state[0][0] == state[1][1] && state[0][0] == state[2][2]) {
            winner = state[0][0];
            return winner;
        }

        if (state[0][2] != '-' && state[0][2] == state[1][1] && state[0][2] == state[2][0]) {
            winner = state[0][2];
            return winner;
        }

        if (turn == 9)
            winner = 'd';


        return winner;
    }

    public void updateState(int buttonId) {
        state[buttonId/3][buttonId%3] = player;
        turn++;

        if (player == '1')
            player = '2';
        else if (player == '2')
            player = '1';
    }

    public char getPlayer() {
        return player;
    }
}
