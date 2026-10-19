package com.braze.models.inappmessage;

import android.net.Uri;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.enums.inappmessage.CropType;
import com.braze.enums.inappmessage.DismissType;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.Orientation;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.models.IPutIntoJson;
import java.util.List;
import java.util.Map;
import kotlin.collections.y;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public interface IInAppMessage extends IPutIntoJson<JSONObject> {
    static /* synthetic */ void setClickBehavior$default(IInAppMessage iInAppMessage, ClickAction clickAction, Uri uri, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setClickBehavior");
        }
        if ((i10 & 2) != 0) {
            uri = null;
        }
        iInAppMessage.setClickBehavior(clickAction, uri);
    }

    boolean getAnimateIn();

    boolean getAnimateOut();

    int getBackgroundColor();

    ClickAction getClickAction();

    CropType getCropType();

    DismissType getDismissType();

    int getDurationInMilliseconds();

    long getExpirationTimestamp();

    Map<String, String> getExtras();

    String getIcon();

    int getIconBackgroundColor();

    int getIconColor();

    default Map<String, String> getLocalPrefetchedAssetPaths() {
        return y.p();
    }

    String getMessage();

    TextAlign getMessageTextAlign();

    int getMessageTextColor();

    MessageType getMessageType();

    boolean getOpenUriInWebView();

    Orientation getOrientation();

    List<String> getRemoteAssetPathsForPrefetch();

    Uri getUri();

    boolean isControl();

    boolean isTestSend();

    boolean logClick();

    boolean logImpression();

    void onAfterClosed();

    void setAnimateIn(boolean z10);

    void setAnimateOut(boolean z10);

    void setBackgroundColor(int i10);

    void setClickBehavior(ClickAction clickAction);

    void setClickBehavior(ClickAction clickAction, Uri uri);

    void setCropType(CropType cropType);

    void setDismissType(DismissType dismissType);

    void setDurationInMilliseconds(int i10);

    void setExpirationTimestamp(long j);

    void setExtras(Map<String, String> map);

    void setIcon(String str);

    void setIconBackgroundColor(int i10);

    void setIconColor(int i10);

    void setLocalPrefetchedAssetPaths(Map<String, String> map);

    void setMessage(String str);

    void setMessageTextAlign(TextAlign textAlign);

    void setMessageTextColor(int i10);

    void setOpenUriInWebView(boolean z10);

    void setOrientation(Orientation orientation);

    void setTestSend(boolean z10);

    static /* synthetic */ void getAnimateIn$annotations() {
    }

    static /* synthetic */ void getAnimateOut$annotations() {
    }

    static /* synthetic */ void getOpenUriInWebView$annotations() {
    }
}
