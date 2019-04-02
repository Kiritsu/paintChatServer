/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import paint.enums.DrawType;
import paint.enums.LogLevel;
import paint.packets.ChatPacket;
import paint.packets.DrawPacket;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;

/**
 * @author user
 */
public class ClientFrame extends JFrame implements KeyListener, MouseListener {

    private Client client;

    /**
     * Creates new form FrameClient
     */
    public ClientFrame(Client client) {
        this.client = client;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        panelText = new JPanel();
        labelText = new JLabel();
        textField = new JTextField();
        panelDrawing = new JPanel();
        panelDrawing.addMouseListener(this);

        redButton = new JButton();
        redButton.addMouseListener(this);

        greenButton = new JButton();
        greenButton.addMouseListener(this);

        blueButton = new JButton();
        blueButton.addMouseListener(this);

        yellowButton = new JButton();
        yellowButton.addMouseListener(this);

        cyanButton = new JButton();
        cyanButton.addMouseListener(this);

        pinkButton = new JButton();
        pinkButton.addMouseListener(this);

        whiteButton = new JButton();
        whiteButton.addMouseListener(this);

        darkButton = new JButton();
        darkButton.addMouseListener(this);

        squareButton = new JButton();
        squareButton.addMouseListener(this);

        circleButton = new JButton();
        circleButton.addMouseListener(this);

        arrowButton = new JButton();
        arrowButton.addMouseListener(this);

        toggleFillButton = new JButton();
        toggleFillButton.addMouseListener(this);

        eraserButton = new JButton();
        eraserButton.addMouseListener(this);

        undoButton = new JButton();
        undoButton.addMouseListener(this);

        textButton = new JButton();
        textButton.addMouseListener(this);

        textField.addKeyListener(this);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Paint Client Serveur");
        setBackground(new Color(255, 255, 255));
        setResizable(false);

        panelText.setBackground(new Color(255, 255, 255));
        panelText.setBorder(BorderFactory.createEtchedBorder());

        labelText.setVerticalAlignment(SwingConstants.TOP);

        GroupLayout panelTextLayout = new GroupLayout(panelText);
        panelText.setLayout(panelTextLayout);
        panelTextLayout.setHorizontalGroup(
                panelTextLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelText, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelTextLayout.setVerticalGroup(
                panelTextLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelText, GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        panelDrawing.setBackground(new Color(255, 255, 255));
        panelDrawing.setBorder(BorderFactory.createEtchedBorder());

        redButton.setBackground(new Color(255, 0, 0));

        greenButton.setBackground(new Color(0, 255, 0));

        blueButton.setBackground(new Color(0, 0, 255));

        yellowButton.setBackground(new Color(255, 255, 0));

        cyanButton.setBackground(new Color(0, 255, 255));

        pinkButton.setBackground(new Color(255, 0, 255));

        whiteButton.setBackground(new Color(255, 255, 255));

        darkButton.setBackground(new Color(0, 0, 0));

        squareButton.setText("Carré");

        circleButton.setText("Rond");

        arrowButton.setText("Flèche");

        toggleFillButton.setText("Plein/Vide");

        eraserButton.setText("Gomme");

        undoButton.setText("Annuler");

        textButton.setText("Texte");

        GroupLayout panelDrawingLayout = new GroupLayout(panelDrawing);
        panelDrawing.setLayout(panelDrawingLayout);
        panelDrawingLayout.setHorizontalGroup(
                panelDrawingLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelDrawingLayout.createSequentialGroup()
                                .addGroup(panelDrawingLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(panelDrawingLayout.createSequentialGroup()
                                                .addGap(72, 72, 72)
                                                .addComponent(redButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(greenButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(blueButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(yellowButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cyanButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(pinkButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(whiteButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(darkButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelDrawingLayout.createSequentialGroup()
                                                .addGap(100, 100, 100)
                                                .addGroup(panelDrawingLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(GroupLayout.Alignment.TRAILING, panelDrawingLayout.createSequentialGroup()
                                                                .addComponent(squareButton)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(circleButton)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(arrowButton)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(eraserButton))
                                                        .addGroup(GroupLayout.Alignment.TRAILING, panelDrawingLayout.createSequentialGroup()
                                                                .addComponent(undoButton)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(textButton)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(toggleFillButton)
                                                                .addGap(22, 22, 22)))))
                                .addContainerGap(72, Short.MAX_VALUE))
        );
        panelDrawingLayout.setVerticalGroup(
                panelDrawingLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, panelDrawingLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelDrawingLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(squareButton)
                                        .addComponent(circleButton)
                                        .addComponent(arrowButton)
                                        .addComponent(eraserButton))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelDrawingLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(undoButton)
                                        .addComponent(textButton)
                                        .addComponent(toggleFillButton))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelDrawingLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(redButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(greenButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(blueButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(yellowButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cyanButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pinkButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(whiteButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(darkButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(textField, GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                                        .addComponent(panelText, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelDrawing, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(panelDrawing, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(panelText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textField, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>


    // Variables declaration - do not modify
    private JButton arrowButton;
    private JButton blueButton;
    private JButton circleButton;
    private JButton cyanButton;
    private JButton darkButton;
    private JButton eraserButton;
    private JButton greenButton;
    private JLabel labelText;
    private JPanel panelDrawing;
    private JPanel panelText;
    private JButton pinkButton;
    private JButton redButton;
    private JButton squareButton;
    private JButton textButton;
    private JTextField textField;
    private JButton toggleFillButton;
    private JButton undoButton;
    private JButton whiteButton;
    private JButton yellowButton;
    // End of variables declaration

    public JLabel getLabelText() {
        return this.labelText;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        JTextField tf = (JTextField)e.getSource();

        if (e.getKeyCode() == 10) {
            client.sendPacket(new ChatPacket("0 " + tf.getText()));
            tf.setText("");
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        try {
            if (e.getSource() instanceof JButton) {
                JButton button = (JButton)e.getSource();

                if (!button.getBackground().equals(new Color(238, 238, 238))) {
                    currentColour = button.getBackground().getRGB();
                    Logger.println(LogLevel.Debug, "MouseClicked", "Changing colour: " + currentColour);
                } else {
                    if (button.equals(squareButton)) {
                        currentShape = DrawType.Square;
                    } else if (button.equals(circleButton)) {
                        currentShape = DrawType.Circle;
                    } else if (button.equals(arrowButton)) {
                        currentShape = DrawType.Arrow;
                    } else if (button.equals(eraserButton)) {
                        currentShape = DrawType.Eraser;
                    } else if (button.equals(undoButton)) {
                        client.sendPacket(new DrawPacket("1 4"));
                    } else if (button.equals(textButton)) {
                        currentShape = DrawType.Text;
                    } else if (button.equals(toggleFillButton)) {
                        fill = !fill;
                    }

                    clickAmount = 0;

                    Logger.println(LogLevel.Debug, "MouseClicked", "Changing shape: " + currentShape);
                }
            } else if (e.getSource() instanceof JPanel) {
                if (clickAmount == 0) {
                    Logger.println(LogLevel.Debug, "MouseClicked", "First click");

                    clickAmount++;
                    x1 = e.getX();
                    y1 = e.getY();

                    if (currentShape == DrawType.Text) {
                        try {
                            String text = JOptionPane.showInputDialog("Entrez le texte à écrire : ");

                            client.sendPacket(new DrawPacket("1 5 " + currentColour + " " + x1 + " " + y1 + " :" + text));
                        }
                        catch (Exception ex) { }
                        clickAmount = 0;
                    } else if (currentShape == DrawType.Eraser) {
                        client.sendPacket(new DrawPacket("1 3 " + e.getX() + " " + e.getY()));
                        clickAmount = 0;
                    }

                } else if (clickAmount == 1) {
                    Logger.println(LogLevel.Debug, "MouseClicked", "Second click");

                    clickAmount = 0;
                    x2 = e.getX();
                    y2 = e.getY();

                    if (currentShape == DrawType.Square) {
                        client.sendPacket(new DrawPacket("1 1 " + (fill ? 1 : 0) + " " + currentColour + " " + x1 + " " + x2 + " " + y1 + " " + y2));
                    } else if (currentShape == DrawType.Circle) {
                        client.sendPacket(new DrawPacket("1 0 " + (fill ? 1 : 0) + " " + currentColour + " " + x1 + " " + x2 + " " + y1 + " " + y2));
                    } else if (currentShape == DrawType.Arrow) {
                        client.sendPacket(new DrawPacket("1 2 1 " + currentColour + " " + x1 + " " + x2 + " " + y1 + " " + y2));
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Graphics getPanelGraphics() {
        return panelDrawing.getGraphics();
    }
    public JPanel getPanelDrawing() { return panelDrawing; }

    private int clickAmount;
    private int currentColour;
    private DrawType currentShape;
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private boolean fill;

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}

}
