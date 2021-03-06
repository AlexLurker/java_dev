import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 * 
 */

/**
 * @author lurker
 *
 */
public class JavaSweeper extends JFrame
{
	//
	private JPanel panel;
	// Константы
	// кол-во колонок
	private final int COLS = 15;
	// кол-во строчек
	private final int ROWS = 1;
	// размер картинок (50x50)
	private final int IMAGE_SIZE = 50;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// Создание экземпляра
		new JavaSweeper();

	}
    
	// Приывтный уонструктор
	private JavaSweeper()
	{
		// Вызов инициализации фрейма
		initFrame();
		// Вызов инициализации панели
		initPanel();
	}
	
	// Функция инициализации панели
	private void initPanel()
	{
		// Создаём панель
		panel = new JPanel();
		// Установка размеров панели
		panel.setPreferredSize(new Dimension(COLS * IMAGE_SIZE, 
				                             ROWS * IMAGE_SIZE));
		// добавить панель на фрейм
		add(panel);
	}
	
	// Функция для подготовки всего необходимого для запуска рамки (frame)
	private void initFrame()
	{
		// Изменяем размер форейма так, чтобы в него всё поместилось
		pack();
		// Закрытие программы
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		// Заголовок окна
		setTitle("Java Sweeper");
		// Открытие окна по центру
		setLocationRelativeTo(null);
		// Запрет изменения размера окна
		setResizable(false);
		// Видимость формы
		setVisible(true);
		
	}
	
}
