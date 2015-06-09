
public class Song 
{
	private String m_songName;
	private int m_ranking;
	private String m_artist;

	
	public Song (int ranking, String songName, String artist)
	{
		m_songName = songName;
		m_ranking = ranking;
		m_artist = artist;
}
	String GetsongName()
	{
		return m_songName;
	}
	
	private void SetsongName(String songName)
	{
		m_songName = songName;
	}
	private void Setranking (int ranking)
	{
		m_ranking = ranking;
	}
	private void Setartist (String artist)
	{
		m_artist = artist;
	}
}



