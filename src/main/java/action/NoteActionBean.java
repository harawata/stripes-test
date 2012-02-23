
package action;

import java.util.Date;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;
import domain.Note;

@UrlBinding("/app/note/{$event}/{note.meetingId}/{note.id}")
public class NoteActionBean extends BaseActionBean
{
	private Date date;

	private Note note;

	@DefaultHandler
	public Resolution create()
	{
		date = new Date();
		return new ForwardResolution("/WEB-INF/jsp/note.jsp");
	}

	public Date getDate()
	{
		return date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	public Note getNote()
	{
		return note;
	}

	public void setNote(Note note)
	{
		this.note = note;
	}
}
