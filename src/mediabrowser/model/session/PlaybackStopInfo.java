package mediabrowser.model.session;

import mediabrowser.model.entities.*;

/** 
 Class PlaybackStopInfo.
*/
public class PlaybackStopInfo
{
	/** 
	 Gets or sets the item.
	 
	 <value>The item.</value>
	*/
	private BaseItemInfo Item;
	public final BaseItemInfo getItem()
	{
		return Item;
	}
	public final void setItem(BaseItemInfo value)
	{
		Item = value;
	}

	/** 
	 Gets or sets the item identifier.
	 
	 <value>The item identifier.</value>
	*/
	private String ItemId;
	public final String getItemId()
	{
		return ItemId;
	}
	public final void setItemId(String value)
	{
		ItemId = value;
	}

	/** 
	 Gets or sets the session id.
	 
	 <value>The session id.</value>
	*/
	private String SessionId;
	public final String getSessionId()
	{
		return SessionId;
	}
	public final void setSessionId(String value)
	{
		SessionId = value;
	}

	/** 
	 Gets or sets the media version identifier.
	 
	 <value>The media version identifier.</value>
	*/
	private String MediaSourceId;
	public final String getMediaSourceId()
	{
		return MediaSourceId;
	}
	public final void setMediaSourceId(String value)
	{
		MediaSourceId = value;
	}

	/** 
	 Gets or sets the position ticks.
	 
	 <value>The position ticks.</value>
	*/
	private Long PositionTicks;
	public final Long getPositionTicks()
	{
		return PositionTicks;
	}
	public final void setPositionTicks(Long value)
	{
		PositionTicks = value;
	}
	/** 
	 Gets or sets the live stream identifier.
	 
	 <value>The live stream identifier.</value>
	*/
	private String LiveStreamId;
	public final String getLiveStreamId()
	{
		return LiveStreamId;
	}
	public final void setLiveStreamId(String value)
	{
		LiveStreamId = value;
	}
}