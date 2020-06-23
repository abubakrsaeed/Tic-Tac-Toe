import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonListener implements ActionListener {
    private static int x=0;
    private static int o=0;

    private BoardFrame board = new BoardFrame();
    private JFrame frame;

    public ButtonListener(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton button = (JButton)e.getSource();
        if (button.getText()==""){
            if (x==o){
                button.setText("X");
                button.setEnabled(false);
                x++;
            }
            else {
                button.setText("O");
                button.setEnabled(false);
                o++;
            }
        }

        int buttonId = Integer.parseInt(e.getActionCommand());
        button.setEnabled(false);

        board.updateState(buttonId);
        char winner = board.getWinner();
        if (winner == 'd') {
            JOptionPane.showMessageDialog(frame, "It's a tie!");
            System.exit(0);
        }
        else if (winner != 0) {
            JOptionPane.showMessageDialog(frame, "Player " + winner + " wins.");
            System.exit(0);
        }

        frame.setTitle("Player " + board.getPlayer());

    }

}
