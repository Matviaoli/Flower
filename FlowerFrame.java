import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class FlowerFrame extends JFrame{
    
    private JTextField pipoca;
    private JRadioButton pacoca, pacoquinha, batata, batatinha;
    private ButtonGroup alcacuz = new ButtonGroup(), regaliz = new ButtonGroup();
    private FlowLayout flower;
    private Container conteiner;
    private JLabel coxinha, biscoito, tapioca;
    private JButton kamui, vacuum;
    
    
    String vazio = "sim", limbo = "não";
    int dumb = 0;
    
    public FlowerFrame(){
        
        super("Flower a flor");
        
        flower = new FlowLayout();
        conteiner = getContentPane();
        setLayout(flower);
        
        coxinha = new JLabel("Número de ingressos: ");
        add(coxinha);
        pipoca = new JTextField(2);
        add(pipoca);
        
        biscoito = new JLabel("Inteira ou Meia: ");
        add(biscoito);
        pacoca = new JRadioButton("Inteira");
        pacoquinha = new JRadioButton("Meia");
        
        alcacuz.add(pacoca);
        alcacuz.add(pacoquinha);
        
        add(pacoca);
        add(pacoquinha);
        
        tapioca = new JLabel("Prefere impresso ou digital: ");
        add(tapioca);
        batata = new JRadioButton("Impresso");
        batatinha = new JRadioButton("Digital");
        
        regaliz.add(batata);
        regaliz.add(batatinha);
        
        add(batata);
        add(batatinha);
        
        kamui = new JButton("Confirmar?");
        kamui.addActionListener( e ->{
           try{
               
               vazio = (pacoca.isSelected()) ? "Inteira" : "Meia Entrada";
               limbo = (batata.isSelected()) ? "Impressos" : "Digitalmente";
               dumb = Integer.parseInt(pipoca.getText());
               
               JOptionPane.showConfirmDialog(null,"Você comprou: "+dumb+" ingressos\nSeus ingreços são: "+vazio+"\nE serão entregues: "+limbo, "Obrigado senhor Otario",JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE);
           }catch (Exception ex){
               JOptionPane.showMessageDialog(null, "Muito Burro KKKKK", "És um verdadeiro Otario", JOptionPane.ERROR_MESSAGE);
           }
        });
        add(kamui);
        
        
        vacuum = new JButton("Limpar");
        vacuum.addActionListener(e ->{
            
            pipoca.setText(void);
            alcacuz.clearSelection();
            regaliz.clearSelection();
        });
        add(vacuum);
        
        
       
        
        
    }
}
