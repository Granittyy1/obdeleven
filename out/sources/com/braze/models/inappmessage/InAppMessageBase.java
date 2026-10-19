package com.braze.models.inappmessage;

import android.graphics.Color;
import android.net.Uri;
import bo.app.C1471i;
import bo.app.a2;
import bo.app.c2;
import bo.app.f3;
import bo.app.h3;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.enums.inappmessage.CropType;
import com.braze.enums.inappmessage.DismissType;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.Orientation;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.EmptyList;
import kotlin.collections.y;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;
import p005a4.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class InAppMessageBase implements IInAppMessage, IInAppMessageThemeable {
    protected static final String ANIMATE_IN = "animate_in";
    protected static final String ANIMATE_OUT = "animate_out";
    public static final String BG_COLOR = "bg_color";
    public static final String CLICK_ACTION = "click_action";
    public static final String CROP_TYPE = "crop_type";
    public static final a Companion = new a(null);
    public static final String DISMISS_TYPE = "message_close";
    public static final String DURATION = "duration";
    public static final String EXTRAS = "extras";
    public static final String ICON = "icon";
    public static final String ICON_BG_COLOR = "icon_bg_color";
    public static final String ICON_COLOR = "icon_color";
    public static final int INAPP_MESSAGE_DURATION_DEFAULT_MILLIS = 5000;
    public static final int INAPP_MESSAGE_DURATION_MIN_MILLIS = 999;
    public static final String IS_CONTROL = "is_control";
    public static final String MESSAGE = "message";
    public static final String MESSAGE_TEXT_ALIGN = "text_align_message";
    public static final String MESSAGE_TEXT_COLOR = "text_color";
    public static final String OPEN_URI_IN_WEBVIEW = "use_webview";
    public static final String ORIENTATION = "orientation";
    public static final String TRIGGER_ID = "trigger_id";
    public static final String TYPE = "type";
    public static final String URI = "uri";
    private boolean animateIn;
    private boolean animateOut;
    private int backgroundColor;
    private c2 brazeManager;
    private final AtomicBoolean clickLogged;
    private CropType cropType;
    private DismissType dismissType;
    private int durationInMilliseconds;
    private long expirationTimestamp;
    private Map<String, String> extras;
    private String icon;
    private int iconBackgroundColor;
    private int iconColor;
    private final AtomicBoolean impressionLogged;
    private h3 inAppMessageDarkThemeWrapper;
    private ClickAction internalClickAction;
    private Uri internalUri;
    private boolean isTestSend;
    private JSONObject jsonObject;
    private String message;
    private TextAlign messageTextAlign;
    private int messageTextColor;
    private boolean openUriInWebView;
    private Orientation orientation;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f24166b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10) {
            super(0);
            this.f24166b = i10;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return q.c(new StringBuilder("Requested in-app message duration "), this.f24166b, " is lower than the minimum of 999. Defaulting to 5000 milliseconds.");
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f24167b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10) {
            super(0);
            this.f24167b = i10;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return q.c(new StringBuilder("Set in-app message duration to "), this.f24167b, " milliseconds.");
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f24168b = new d();

        public d() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cannot apply dark theme with a null themes wrapper";
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f24169b = new e();

        public e() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to construct json for in-app message";
        }
    }

    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f24170b = new f();

        public f() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Trigger id not found (this is expected for test sends). Not logging in-app message click.";
        }
    }

    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f24171b = new g();

        public g() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cannot log an in-app message click because the BrazeManager is null.";
        }
    }

    public static final class h extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f24172b = new h();

        public h() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Click already logged for this in-app message. Ignoring.";
        }
    }

    public static final class i extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i f24173b = new i();

        public i() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Logging click on in-app message";
        }
    }

    public static final class j extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f24174b = new j();

        public j() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Trigger id not found (this is expected for test sends). Not logging in-app message impression.";
        }
    }

    public static final class k extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final k f24175b = new k();

        public k() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cannot log an in-app message impression because the BrazeManager is null.";
        }
    }

    public static final class l extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final l f24176b = new l();

        public l() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Impression already logged for this in-app message. Ignoring.";
        }
    }

    public static final class m extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final m f24177b = new m();

        public m() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "A non-null URI is required in order to set the message ClickAction to URI.";
        }
    }

    public static final class n extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final n f24178b = new n();

        public n() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "A non-null URI is required in order to set the message ClickAction to URI.";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppMessageBase(JSONObject json, c2 brazeManager) {
        this(json, brazeManager, false, false, 12, null);
        kotlin.jvm.internal.i.e(json, "json");
        kotlin.jvm.internal.i.e(brazeManager, "brazeManager");
    }

    @Override // com.braze.models.inappmessage.IInAppMessageThemeable
    public void enableDarkTheme() {
        h3 h3Var = this.inAppMessageDarkThemeWrapper;
        if (h3Var == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, d.f24168b, 3, (Object) null);
            return;
        }
        if (h3Var.a() != null) {
            setBackgroundColor(h3Var.a().intValue());
        }
        if (h3Var.f() != null) {
            setIconColor(h3Var.f().intValue());
        }
        if (h3Var.e() != null) {
            setIconBackgroundColor(h3Var.e().intValue());
        }
        if (h3Var.g() != null) {
            setMessageTextColor(h3Var.g().intValue());
        }
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean getAnimateIn() {
        return this.animateIn;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean getAnimateOut() {
        return this.animateOut;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final c2 getBrazeManager() {
        return this.brazeManager;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public ClickAction getClickAction() {
        return this.internalClickAction;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public CropType getCropType() {
        return this.cropType;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public DismissType getDismissType() {
        return this.dismissType;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public int getDurationInMilliseconds() {
        return this.durationInMilliseconds;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public long getExpirationTimestamp() {
        return this.expirationTimestamp;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public Map<String, String> getExtras() {
        return this.extras;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public String getIcon() {
        return this.icon;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public int getIconBackgroundColor() {
        return this.iconBackgroundColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public int getIconColor() {
        return this.iconColor;
    }

    public final h3 getInAppMessageDarkThemeWrapper() {
        return this.inAppMessageDarkThemeWrapper;
    }

    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public String getMessage() {
        return this.message;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public TextAlign getMessageTextAlign() {
        return this.messageTextAlign;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public int getMessageTextColor() {
        return this.messageTextColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean getOpenUriInWebView() {
        return this.openUriInWebView;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public Orientation getOrientation() {
        return this.orientation;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public List<String> getRemoteAssetPathsForPrefetch() {
        return EmptyList.f42983b;
    }

    public final String getTriggerId() {
        JSONObject jSONObject = this.jsonObject;
        if (jSONObject != null) {
            return jSONObject.optString(TRIGGER_ID);
        }
        return null;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public Uri getUri() {
        return this.internalUri;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean isControl() {
        JSONObject jSONObject = this.jsonObject;
        return jSONObject != null && jSONObject.optBoolean(IS_CONTROL);
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean isTestSend() {
        return this.isTestSend;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean logClick() {
        String triggerId = getTriggerId();
        if (triggerId == null || kotlin.text.n.S(triggerId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, f.f24170b, 3, (Object) null);
            return false;
        }
        c2 c2Var = this.brazeManager;
        if (c2Var == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, g.f24171b, 2, (Object) null);
            return false;
        }
        if (this.clickLogged.get() && getMessageType() != MessageType.HTML) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, h.f24172b, 2, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, i.f24173b, 2, (Object) null);
        a2 a2VarG = C1471i.f21202h.g(triggerId);
        if (a2VarG != null) {
            c2Var.a(a2VarG);
        }
        this.clickLogged.set(true);
        return true;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean logImpression() {
        String triggerId = getTriggerId();
        if (triggerId == null || kotlin.text.n.S(triggerId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.D, (Throwable) null, j.f24174b, 2, (Object) null);
            return false;
        }
        c2 c2Var = this.brazeManager;
        if (c2Var == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, k.f24175b, 2, (Object) null);
            return false;
        }
        if (this.impressionLogged.get()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, l.f24176b, 2, (Object) null);
            return false;
        }
        a2 a2VarI = C1471i.f21202h.i(triggerId);
        if (a2VarI != null) {
            c2Var.a(a2VarI);
        }
        this.impressionLogged.set(true);
        return true;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void onAfterClosed() {
        c2 c2Var;
        String triggerId = getTriggerId();
        if (!this.clickLogged.get() || triggerId == null || triggerId.length() == 0 || (c2Var = this.brazeManager) == null) {
            return;
        }
        c2Var.a(new f3(triggerId));
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setAnimateIn(boolean z10) {
        this.animateIn = z10;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setAnimateOut(boolean z10) {
        this.animateOut = z10;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setBackgroundColor(int i10) {
        this.backgroundColor = i10;
    }

    public final void setBrazeManager(c2 c2Var) {
        this.brazeManager = c2Var;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setClickBehavior(ClickAction clickAction) {
        kotlin.jvm.internal.i.e(clickAction, "clickAction");
        setClickBehavior(clickAction, null);
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setCropType(CropType cropType) {
        kotlin.jvm.internal.i.e(cropType, "<set-?>");
        this.cropType = cropType;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setDismissType(DismissType dismissType) {
        kotlin.jvm.internal.i.e(dismissType, "<set-?>");
        this.dismissType = dismissType;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setDurationInMilliseconds(int i10) {
        if (i10 < 999) {
            this.durationInMilliseconds = INAPP_MESSAGE_DURATION_DEFAULT_MILLIS;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new b(i10), 3, (Object) null);
        } else {
            this.durationInMilliseconds = i10;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new c(i10), 3, (Object) null);
        }
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setExpirationTimestamp(long j10) {
        this.expirationTimestamp = j10;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setExtras(Map<String, String> map) {
        kotlin.jvm.internal.i.e(map, "<set-?>");
        this.extras = map;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setIcon(String str) {
        this.icon = str;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setIconBackgroundColor(int i10) {
        this.iconBackgroundColor = i10;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setIconColor(int i10) {
        this.iconColor = i10;
    }

    public final void setInAppMessageDarkThemeWrapper(h3 h3Var) {
        this.inAppMessageDarkThemeWrapper = h3Var;
    }

    public final void setJsonObject(JSONObject jSONObject) {
        this.jsonObject = jSONObject;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setLocalPrefetchedAssetPaths(Map<String, String> remotePathToLocalAssetMap) {
        kotlin.jvm.internal.i.e(remotePathToLocalAssetMap, "remotePathToLocalAssetMap");
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setMessage(String str) {
        this.message = str;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setMessageTextAlign(TextAlign textAlign) {
        kotlin.jvm.internal.i.e(textAlign, "<set-?>");
        this.messageTextAlign = textAlign;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setMessageTextColor(int i10) {
        this.messageTextColor = i10;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setOpenUriInWebView(boolean z10) {
        this.openUriInWebView = z10;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setOrientation(Orientation orientation) {
        kotlin.jvm.internal.i.e(orientation, "<set-?>");
        this.orientation = orientation;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setTestSend(boolean z10) {
        this.isTestSend = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppMessageBase(JSONObject json, c2 brazeManager, boolean z10) {
        this(json, brazeManager, z10, false, 8, null);
        kotlin.jvm.internal.i.e(json, "json");
        kotlin.jvm.internal.i.e(brazeManager, "brazeManager");
    }

    @Override // com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        JSONObject jSONObject = this.jsonObject;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.putOpt("message", getMessage());
            jSONObject2.put(DURATION, getDurationInMilliseconds());
            jSONObject2.putOpt(TRIGGER_ID, getTriggerId());
            jSONObject2.putOpt(CLICK_ACTION, getClickAction().toString());
            jSONObject2.putOpt(DISMISS_TYPE, getDismissType().toString());
            if (getUri() != null) {
                jSONObject2.put("uri", String.valueOf(getUri()));
            }
            jSONObject2.put(OPEN_URI_IN_WEBVIEW, getOpenUriInWebView());
            jSONObject2.put(ANIMATE_IN, getAnimateIn());
            jSONObject2.put(ANIMATE_OUT, getAnimateOut());
            jSONObject2.put(BG_COLOR, getBackgroundColor());
            jSONObject2.put(MESSAGE_TEXT_COLOR, getMessageTextColor());
            jSONObject2.put(ICON_COLOR, getIconColor());
            jSONObject2.put(ICON_BG_COLOR, getIconBackgroundColor());
            jSONObject2.putOpt(ICON, getIcon());
            jSONObject2.putOpt(CROP_TYPE, getCropType().toString());
            jSONObject2.putOpt(ORIENTATION, getOrientation().toString());
            jSONObject2.putOpt(MESSAGE_TEXT_ALIGN, getMessageTextAlign().toString());
            jSONObject2.putOpt(IS_CONTROL, Boolean.valueOf(isControl()));
            if (!getExtras().isEmpty()) {
                jSONObject2.put(EXTRAS, getExtras());
            }
        } catch (JSONException e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, e.f24169b);
        }
        return jSONObject2;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setClickBehavior(ClickAction clickAction, Uri uri) {
        kotlin.jvm.internal.i.e(clickAction, "clickAction");
        if (uri == null && clickAction == ClickAction.URI) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, m.f24177b, 2, (Object) null);
            return;
        }
        if (uri != null && clickAction == ClickAction.URI) {
            this.internalClickAction = clickAction;
            this.internalUri = uri;
        } else if (clickAction == ClickAction.URI) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, n.f24178b, 2, (Object) null);
        } else {
            this.internalClickAction = clickAction;
            this.internalUri = null;
        }
    }

    public InAppMessageBase() {
        this.internalClickAction = ClickAction.NONE;
        this.extras = y.p();
        this.animateIn = true;
        this.animateOut = true;
        this.dismissType = DismissType.AUTO_DISMISS;
        this.durationInMilliseconds = INAPP_MESSAGE_DURATION_DEFAULT_MILLIS;
        this.orientation = Orientation.ANY;
        this.cropType = CropType.FIT_CENTER;
        this.messageTextAlign = TextAlign.CENTER;
        this.expirationTimestamp = -1L;
        this.iconBackgroundColor = Color.parseColor("#ff0073d5");
        this.messageTextColor = Color.parseColor("#555555");
        this.backgroundColor = -1;
        this.iconColor = -1;
        this.impressionLogged = new AtomicBoolean(false);
        this.clickLogged = new AtomicBoolean(false);
    }

    public static /* synthetic */ void getAnimateIn$annotations() {
    }

    public static /* synthetic */ void getAnimateOut$annotations() {
    }

    public static /* synthetic */ void getOpenUriInWebView$annotations() {
    }

    public /* synthetic */ InAppMessageBase(JSONObject jSONObject, c2 c2Var, boolean z10, boolean z11, int i10, kotlin.jvm.internal.e eVar) {
        this(jSONObject, c2Var, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11);
    }

    public InAppMessageBase(JSONObject json, c2 brazeManager, boolean z10, boolean z11) {
        DismissType dismissType;
        String upperCase;
        DismissType[] dismissTypeArrValues;
        int length;
        kotlin.jvm.internal.i.e(json, "json");
        kotlin.jvm.internal.i.e(brazeManager, "brazeManager");
        this.internalClickAction = ClickAction.NONE;
        this.extras = y.p();
        this.animateIn = true;
        this.animateOut = true;
        this.dismissType = DismissType.AUTO_DISMISS;
        this.durationInMilliseconds = INAPP_MESSAGE_DURATION_DEFAULT_MILLIS;
        Orientation orientation = Orientation.ANY;
        this.orientation = orientation;
        this.cropType = CropType.FIT_CENTER;
        this.messageTextAlign = TextAlign.CENTER;
        this.expirationTimestamp = -1L;
        this.iconBackgroundColor = Color.parseColor("#ff0073d5");
        this.messageTextColor = Color.parseColor("#555555");
        this.backgroundColor = -1;
        this.iconColor = -1;
        int i10 = 0;
        this.impressionLogged = new AtomicBoolean(false);
        this.clickLogged = new AtomicBoolean(false);
        this.jsonObject = json;
        this.brazeManager = brazeManager;
        setMessage(json.optString("message"));
        setAnimateIn(json.optBoolean(ANIMATE_IN, true));
        setAnimateOut(json.optBoolean(ANIMATE_OUT, true));
        setDurationInMilliseconds(json.optInt(DURATION));
        setIcon(json.optString(ICON));
        try {
            com.braze.support.c cVar = com.braze.support.c.f24371a;
            String string = json.getString(ORIENTATION);
            kotlin.jvm.internal.i.d(string, "jsonObject.getString(key)");
            Locale US = Locale.US;
            kotlin.jvm.internal.i.d(US, "US");
            String upperCase2 = string.toUpperCase(US);
            kotlin.jvm.internal.i.d(upperCase2, "this as java.lang.String).toUpperCase(locale)");
            Orientation[] orientationArrValues = Orientation.values();
            int length2 = orientationArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 < length2) {
                    Orientation orientation2 = orientationArrValues[i11];
                    if (kotlin.jvm.internal.i.a(orientation2.name(), upperCase2)) {
                        orientation = orientation2;
                        break;
                    }
                    i11++;
                } else {
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
        } catch (Exception unused) {
        }
        setOrientation(orientation);
        setOpenUriInWebView(json.optBoolean(OPEN_URI_IN_WEBVIEW, false));
        setIconBackgroundColor(json.optInt(ICON_BG_COLOR));
        setMessageTextColor(json.optInt(MESSAGE_TEXT_COLOR));
        setBackgroundColor(json.optInt(BG_COLOR));
        setIconColor(json.optInt(ICON_COLOR));
        this.impressionLogged.set(z10);
        this.clickLogged.set(z11);
        setExtras(JsonUtils.convertJSONObjectToMap(json.optJSONObject(EXTRAS)));
        String strOptString = json.optString("uri");
        ClickAction clickAction = ClickAction.NONE;
        try {
            try {
                com.braze.support.c cVar2 = com.braze.support.c.f24371a;
                String string2 = json.getString(CLICK_ACTION);
                kotlin.jvm.internal.i.d(string2, "jsonObject.getString(key)");
                Locale US2 = Locale.US;
                kotlin.jvm.internal.i.d(US2, "US");
                String upperCase3 = string2.toUpperCase(US2);
                kotlin.jvm.internal.i.d(upperCase3, "this as java.lang.String).toUpperCase(locale)");
                ClickAction[] clickActionArrValues = ClickAction.values();
                int length3 = clickActionArrValues.length;
                int i12 = 0;
                while (true) {
                    if (i12 < length3) {
                        ClickAction clickAction2 = clickActionArrValues[i12];
                        if (kotlin.jvm.internal.i.a(clickAction2.name(), upperCase3)) {
                            clickAction = clickAction2;
                            break;
                        }
                        i12++;
                    } else {
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                }
                while (true) {
                    if (i10 < length) {
                        DismissType dismissType2 = dismissTypeArrValues[i10];
                        if (kotlin.jvm.internal.i.a(dismissType2.name(), upperCase)) {
                            dismissType = dismissType2;
                            break;
                        }
                        i10++;
                    } else {
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                }
            } catch (Exception unused2) {
            }
            com.braze.support.c cVar3 = com.braze.support.c.f24371a;
            String string3 = json.getString(DISMISS_TYPE);
            kotlin.jvm.internal.i.d(string3, "jsonObject.getString(key)");
            Locale US3 = Locale.US;
            kotlin.jvm.internal.i.d(US3, "US");
            upperCase = string3.toUpperCase(US3);
            kotlin.jvm.internal.i.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
            dismissTypeArrValues = DismissType.values();
            length = dismissTypeArrValues.length;
        } catch (Exception unused3) {
        }
        if (clickAction == ClickAction.URI && strOptString != null && !kotlin.text.n.S(strOptString)) {
            this.internalUri = Uri.parse(strOptString);
        }
        this.internalClickAction = clickAction;
        dismissType = DismissType.AUTO_DISMISS;
        setDismissType(dismissType == DismissType.SWIPE ? DismissType.MANUAL : dismissType);
        this.inAppMessageDarkThemeWrapper = com.braze.support.h.a(json);
    }
}
