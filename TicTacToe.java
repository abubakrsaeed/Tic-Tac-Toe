import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class TicTacToe extends JFrame {

    public TicTacToe() {

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3, 3));
        this.setTitle("Player 1");
        this.setSize(400, 400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        ButtonListener listener = new ButtonListener(this);

        for (int i = 0; i < 9; i++) {
            JButton button = new JButton();
            button.setActionCommand("" + i);
            button.addActionListener(listener);
            this.add(button);
        }
    }

    public static void main(String[] args) {
        new TicTacToe();
    }

}
