import javax.swing.JFrame;
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
