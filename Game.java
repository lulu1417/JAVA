package ingame;
import java.util.ArrayList;
public class Game {
	public static final int Width = 1600;
	public static final int Height = 900;
	public static ArrayList<String> signals = new ArrayList<String>();
	public static ArrayList<GraphicItem> graphicItems = new ArrayList<GraphicItem>();
	public static ArrayList<Player> players = new ArrayList<Player>();
	public static GameState gamestate = GameState.INIT;
	public static int playerCount = 4;
	public static final Cell[] cells = {
		new Cell("������",370,220,CellType.START),
		new Cell("���\��",370,310,CellType.SELECT).setScore(-10).setMessage("���\��G�Q�ժ��l"),
		new Cell("���@���G�J��",370,400,CellType.SELECT).setScore(20).setMessage("���_�J�١G�b�J�ٰ��i�ߨS�Q�o�{"),
		new Cell("���\�U",370,490,CellType.FATE).setMessage("�q�ߤl"),
		new Cell("���_�޳�",370,590,CellType.SELECT).setScore(-5).setMessage("��m�A�o"),
		new Cell("�Ĥ@���ʤ���",370,690,CellType.SELECT).setScore(30).setMessage("��W���ηF��").setSelectPolicy(PlayerScoreType.CLUB),
		new Cell("�u�����v�J��",465,690,CellType.SELECT).setScore(-20).setMessage("��V�����A�L�n���Q��").setSelectPolicy(PlayerScoreType.LESSON),
		new Cell("�`�Ϯ��]",560,690,CellType.FATE).setMessage("�`�ϡG���Ѥ�"),
		new Cell("��T�t�]",655,690,CellType.SELECT).setScore(30).setMessage("��T�t�]�G�{�u�W��"),
		new Cell("�@D24",750,690,CellType.CHANCE).setMessage("D24�G���|"),
		new Cell("�E���E",845,690,CellType.SELECT).setScore(-10).setMessage("�����H���Q��Q"),
		new Cell("�|�ֵ�",940,690,CellType.SELECT).setScore(-10).setMessage("�Y������"),
		new Cell("�ӤE��",1035,690,CellType.SELECT).setScore(-10).setMessage("�M�ǤͦP�ɧj�Y�v�A���J�ٸ��q"),
		new Cell("�ӫ�",1130,690,CellType.FATE).setMessage("���R��"),
		new Cell("�Ϯѳ�",1225,690,CellType.SHOP).setMessage("�Ϯѳ��G����ɶ�"),
		new Cell("�����",1225,590,CellType.SELECT).setScore(10).setMessage("�����Y���@�Ӥj���J"),
		new Cell("��Өt�]",1225,495,CellType.CHANCE).setMessage("��Өt�]�GNothing happen"),
		new Cell("����t�]",1225,400,CellType.NOTHING).setScore(30).setMessage("����t�]�GNothing happen"),
		new Cell("�۱j�޳�",1225,310,CellType.SELECT).setScore(-10).setMessage("�۱j�޳��G��m�ιL�Y"),
		new Cell("�q�@��",1225,220,CellType.SELECT).setScore(-5).setMessage("�q�@�١G�a�k�ͦ^�J�ٹL�]�Q���"),
		new Cell("�sK�]",1135,220,CellType.CHANCE).setScore(30).setMessage("�sk�]�GNothing happen"),
		new Cell("���j��|",1045,220,CellType.HOSPITAL).setMessage("��|�G��|�@�g�A�Ȱ��@�^�X"),
		new Cell("�����U",950,220,CellType.CHANCE).setMessage("�����U�G���|"),
		new Cell("��|���]�\�U",850,220,CellType.SELECT).setScore(15).setMessage("���\�G�ǥ����u�f"),
		new Cell("����|",760,220,CellType.SELECT).setScore(30).setMessage("����|�G�{�u�W��"),
		new Cell("���v�t�]",665,220,CellType.SELECT).setScore(15).setMessage("���v�t�]�G�[ñ��ฮ�v"),
		new Cell("�_��",575,220,CellType.CHANCE),
		new Cell("�c�泡",475,220,CellType.SHOP)
	};

}
