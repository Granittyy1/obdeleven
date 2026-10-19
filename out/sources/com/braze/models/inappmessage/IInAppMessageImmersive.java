package com.braze.models.inappmessage;

import com.braze.enums.inappmessage.ImageStyle;
import com.braze.enums.inappmessage.TextAlign;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface IInAppMessageImmersive extends IInAppMessage {
    int getCloseButtonColor();

    Integer getFrameColor();

    String getHeader();

    TextAlign getHeaderTextAlign();

    int getHeaderTextColor();

    ImageStyle getImageStyle();

    List<MessageButton> getMessageButtons();

    boolean logButtonClick(MessageButton messageButton);

    void setCloseButtonColor(int i10);

    void setFrameColor(Integer num);

    void setHeader(String str);

    void setHeaderTextAlign(TextAlign textAlign);

    void setHeaderTextColor(int i10);

    void setImageStyle(ImageStyle imageStyle);

    void setMessageButtons(List<? extends MessageButton> list);
}
