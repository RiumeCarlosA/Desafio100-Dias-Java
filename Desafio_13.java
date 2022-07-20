import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class Desafio_13 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Desafio_13 window = new Desafio_13();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Desafio_13() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Dialog", Font.PLAIN, 12));
		frame.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frame.setBounds(100, 100, 616, 438);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea txtrInicio = new JTextArea();
		txtrInicio.setFont(new Font("Dialog", Font.PLAIN, 11));
		txtrInicio.setRows(10);
		txtrInicio.setLineWrap(true);
		txtrInicio.setColumns(10);
		txtrInicio.setBounds(33, 44, 55, 15);
		frame.getContentPane().add(txtrInicio);
		
		JLabel lblInicio = new JLabel("Inicio");
		lblInicio.setFont(new Font("Dialog", Font.BOLD, 12));
		lblInicio.setBounds(33, 26, 55, 15);
		frame.getContentPane().add(lblInicio);
		
		JLabel lblEmitirAta = new JLabel("Emitir Ata");
		lblEmitirAta.setFont(new Font("Noto Sans Black", Font.ITALIC, 16));
		lblEmitirAta.setBounds(515, 12, 87, 15);
		frame.getContentPane().add(lblEmitirAta);
		
		JLabel lblFim = new JLabel("Fim");
		lblFim.setFont(new Font("Dialog", Font.BOLD, 12));
		lblFim.setBounds(100, 25, 55, 16);
		frame.getContentPane().add(lblFim);
		
		JTextArea txtrFim = new JTextArea();
		txtrFim.setFont(new Font("Dialog", Font.PLAIN, 11));
		txtrFim.setRows(10);
		txtrFim.setLineWrap(true);
		txtrFim.setColumns(10);
		txtrFim.setBounds(100, 44, 55, 15);
		frame.getContentPane().add(txtrFim);
		
		JLabel lblSetor = new JLabel("Setor");
		lblSetor.setFont(new Font("Dialog", Font.BOLD, 12));
		lblSetor.setBounds(167, 25, 55, 16);
		frame.getContentPane().add(lblSetor);
		
		JLabel lblTtulo = new JLabel("Título");
		lblTtulo.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTtulo.setBounds(33, 63, 55, 15);
		frame.getContentPane().add(lblTtulo);
		
		JLabel lblPauta = new JLabel("Pauta");
		lblPauta.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPauta.setBounds(33, 100, 55, 15);
		frame.getContentPane().add(lblPauta);
		
		JTextArea txtrTtulo = new JTextArea();
		txtrTtulo.setFont(new Font("Dialog", Font.PLAIN, 11));
		txtrTtulo.setRows(10);
		txtrTtulo.setLineWrap(true);
		txtrTtulo.setColumns(10);
		txtrTtulo.setBounds(33, 81, 487, 15);
		frame.getContentPane().add(txtrTtulo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Setores"}));
		comboBox.setToolTipText("Setores");
		comboBox.setFont(new Font("Dialog", Font.BOLD, 11));
		comboBox.setBounds(167, 44, 353, 15);
		frame.getContentPane().add(comboBox);
		
		JTextArea txtrDemonstrarAosParticipantes = new JTextArea();
		txtrDemonstrarAosParticipantes.setRows(10);
		txtrDemonstrarAosParticipantes.setLineWrap(true);
		txtrDemonstrarAosParticipantes.setFont(new Font("Dialog", Font.PLAIN, 11));
		txtrDemonstrarAosParticipantes.setColumns(10);
		txtrDemonstrarAosParticipantes.setBounds(33, 121, 487, 15);
		frame.getContentPane().add(txtrDemonstrarAosParticipantes);
		
		JLabel lblDescrio = new JLabel("Descrição");
		lblDescrio.setFont(new Font("Dialog", Font.BOLD, 12));
		lblDescrio.setBounds(33, 138, 98, 15);
		frame.getContentPane().add(lblDescrio);
		
		JTextArea txtrAReunioIniciouse = new JTextArea();
		txtrAReunioIniciouse.setRows(10);
		txtrAReunioIniciouse.setLineWrap(true);
		txtrAReunioIniciouse.setFont(new Font("Dialog", Font.PLAIN, 11));
		txtrAReunioIniciouse.setColumns(10);
		txtrAReunioIniciouse.setBounds(33, 158, 487, 15);
		frame.getContentPane().add(txtrAReunioIniciouse);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTipo.setBounds(33, 180, 98, 15);
		frame.getContentPane().add(lblTipo);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Dialog", Font.BOLD, 11));
		comboBox_1.setBounds(33, 201, 353, 15);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblPalavrasChaves = new JLabel("Palavras Chaves");
		lblPalavrasChaves.setFont(new Font("Dialog", Font.BOLD, 12));
		lblPalavrasChaves.setBounds(33, 222, 175, 15);
		frame.getContentPane().add(lblPalavrasChaves);
		
		JTextArea textArea_2_1_1_1 = new JTextArea();
		textArea_2_1_1_1.setRows(10);
		textArea_2_1_1_1.setLineWrap(true);
		textArea_2_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 11));
		textArea_2_1_1_1.setColumns(10);
		textArea_2_1_1_1.setBounds(33, 240, 487, 15);
		frame.getContentPane().add(textArea_2_1_1_1);
		
		JButton btnMembrosExternos = new JButton("Membros Externos");
		btnMembrosExternos.setFont(new Font("Dialog", Font.BOLD, 10));
		btnMembrosExternos.setBounds(381, 270, 139, 23);
		frame.getContentPane().add(btnMembrosExternos);
		
		JLabel lblParticipantes = new JLabel("Participantes");
		lblParticipantes.setFont(new Font("Dialog", Font.BOLD, 14));
		lblParticipantes.setBounds(33, 270, 175, 15);
		frame.getContentPane().add(lblParticipantes);
		
		JLabel lblMatrculas = new JLabel("Matrículas");
		lblMatrculas.setFont(new Font("Dialog", Font.BOLD, 12));
		lblMatrculas.setBounds(33, 295, 175, 15);
		frame.getContentPane().add(lblMatrculas);
		
		JTextArea textArea_2_1_1_2 = new JTextArea();
		textArea_2_1_1_2.setRows(10);
		textArea_2_1_1_2.setLineWrap(true);
		textArea_2_1_1_2.setFont(new Font("Dialog", Font.PLAIN, 11));
		textArea_2_1_1_2.setColumns(10);
		textArea_2_1_1_2.setBounds(33, 318, 79, 15);
		frame.getContentPane().add(textArea_2_1_1_2);
		
		JTextArea textArea_2_1_1_2_1 = new JTextArea();
		textArea_2_1_1_2_1.setRows(10);
		textArea_2_1_1_2_1.setLineWrap(true);
		textArea_2_1_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 11));
		textArea_2_1_1_2_1.setColumns(10);
		textArea_2_1_1_2_1.setBounds(124, 318, 79, 15);
		frame.getContentPane().add(textArea_2_1_1_2_1);
		
		JTextArea textArea_2_1_1_1_1 = new JTextArea();
		textArea_2_1_1_1_1.setRows(10);
		textArea_2_1_1_1_1.setLineWrap(true);
		textArea_2_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 11));
		textArea_2_1_1_1_1.setColumns(10);
		textArea_2_1_1_1_1.setBounds(215, 318, 211, 15);
		frame.getContentPane().add(textArea_2_1_1_1_1);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNome.setBounds(215, 295, 175, 15);
		frame.getContentPane().add(lblNome);
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.setFont(new Font("Dialog", Font.BOLD, 10));
		btnIncluir.setBounds(438, 317, 82, 16);
		frame.getContentPane().add(btnIncluir);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(213, 362, 117, 25);
		frame.getContentPane().add(btnSalvar);
	}
}
