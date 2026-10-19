package com.braze.models.inappmessage;

import android.graphics.Color;
import android.net.Uri;
import bo.app.o3;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class MessageButton implements IPutIntoJson<JSONObject>, IInAppMessageThemeable {
    private static final String BG_COLOR = "bg_color";
    private static final String BORDER_COLOR = "border_color";
    private static final String CLICK_ACTION = "click_action";
    private static final String ID = "id";
    private static final String OPEN_URI_IN_WEBVIEW = "use_webview";
    private static final String TEXT = "text";
    private static final String TEXT_COLOR = "text_color";
    private static final String URI = "uri";
    private int backgroundColor;
    private int borderColor;
    private ClickAction clickAction;
    private o3 darkTheme;
    private int id;
    private JSONObject jsonObject;
    private boolean openUriInWebview;
    private String text;
    private int textColor;
    private Uri uri;
    public static final a Companion = new a(null);
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) MessageButton.class);

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f24197b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cannot apply dark theme with a null themes wrapper";
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f24198b = new c();

        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "A non-null URI is required in order to set the button ClickAction to URI.";
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f24199b = new d();

        public d() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "ClickAction of URI is required in order to set a non-null URI";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MessageButton(JSONObject jsonObject) {
        this(jsonObject, null, 2, 0 == true ? 1 : 0);
        i.e(jsonObject, "jsonObject");
    }

    public static /* synthetic */ void setClickBehavior$default(MessageButton messageButton, ClickAction clickAction, Uri uri, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setClickBehavior");
        }
        if ((i10 & 2) != 0) {
            uri = null;
        }
        messageButton.setClickBehavior(clickAction, uri);
    }

    @Override // com.braze.models.inappmessage.IInAppMessageThemeable
    public void enableDarkTheme() {
        o3 o3Var = this.darkTheme;
        if (o3Var == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) b.f24197b, 6, (Object) null);
            return;
        }
        if (o3Var.a() != null) {
            this.backgroundColor = o3Var.a().intValue();
        }
        if (o3Var.c() != null) {
            this.textColor = o3Var.c().intValue();
        }
        if (o3Var.b() != null) {
            this.borderColor = o3Var.b().intValue();
        }
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBorderColor() {
        return this.borderColor;
    }

    public final ClickAction getClickAction() {
        return this.clickAction;
    }

    public final int getId() {
        return this.id;
    }

    public final boolean getOpenUriInWebview() {
        return this.openUriInWebview;
    }

    public final String getStringId() {
        return String.valueOf(this.id);
    }

    public final String getText() {
        return this.text;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final void setBackgroundColor(int i10) {
        this.backgroundColor = i10;
    }

    public final void setBorderColor(int i10) {
        this.borderColor = i10;
    }

    public final void setClickBehavior(ClickAction clickAction) {
        i.e(clickAction, "clickAction");
        setClickBehavior$default(this, clickAction, null, 2, null);
    }

    public final void setOpenUriInWebview(boolean z10) {
        this.openUriInWebview = z10;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setTextColor(int i10) {
        this.textColor = i10;
    }

    public MessageButton() {
        this.id = -1;
        this.clickAction = ClickAction.NONE;
        int color = Color.parseColor("#1B78CF");
        this.backgroundColor = color;
        this.textColor = -1;
        this.borderColor = color;
    }

    @Override // com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.id);
            jSONObject.put("click_action", this.clickAction.toString());
            Uri uri = this.uri;
            if (uri != null) {
                jSONObject.put("uri", String.valueOf(uri));
            }
            jSONObject.putOpt("text", this.text);
            jSONObject.put("bg_color", this.backgroundColor);
            jSONObject.put("text_color", this.textColor);
            jSONObject.put("use_webview", this.openUriInWebview);
            jSONObject.put(BORDER_COLOR, this.borderColor);
            return jSONObject;
        } catch (JSONException unused) {
            return this.jsonObject;
        }
    }

    public final void setClickBehavior(ClickAction clickAction, Uri uri) {
        i.e(clickAction, "clickAction");
        if (uri == null && clickAction == ClickAction.URI) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, (Ia.a) c.f24198b, 4, (Object) null);
        } else if (uri != null && clickAction != ClickAction.URI) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, (Ia.a) d.f24199b, 4, (Object) null);
        } else {
            this.clickAction = clickAction;
            this.uri = uri;
        }
    }

    public /* synthetic */ MessageButton(JSONObject jSONObject, JSONObject jSONObject2, int i10, e eVar) {
        this(jSONObject, (i10 & 2) != 0 ? null : jSONObject2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MessageButton(JSONObject jsonObject, JSONObject jSONObject) {
        ClickAction clickAction;
        i.e(jsonObject, "jsonObject");
        int iOptInt = jsonObject.optInt("id", -1);
        ClickAction clickAction2 = ClickAction.NEWS_FEED;
        try {
            com.braze.support.c cVar = com.braze.support.c.f24371a;
            String string = jsonObject.getString("click_action");
            i.d(string, "jsonObject.getString(key)");
            Locale US = Locale.US;
            i.d(US, "US");
            String upperCase = string.toUpperCase(US);
            i.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
            for (ClickAction clickAction3 : ClickAction.values()) {
                if (i.a(clickAction3.name(), upperCase)) {
                    clickAction = clickAction3;
                    String strOptString = jsonObject.optString("uri");
                    String strOptString2 = jsonObject.optString("text");
                    i.d(strOptString2, "jsonObject.optString(TEXT)");
                    this(jsonObject, jSONObject, iOptInt, clickAction, strOptString, strOptString2, jsonObject.optInt("bg_color"), jsonObject.optInt("text_color"), jsonObject.optBoolean("use_webview", false), jsonObject.optInt(BORDER_COLOR));
                    return;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Exception unused) {
            clickAction = clickAction2;
        }
    }

    private MessageButton(JSONObject jSONObject, JSONObject jSONObject2, int i10, ClickAction clickAction, String str, String str2, int i11, int i12, boolean z10, int i13) {
        this.id = -1;
        this.clickAction = ClickAction.NONE;
        int color = Color.parseColor("#1B78CF");
        this.backgroundColor = color;
        this.textColor = -1;
        this.borderColor = color;
        this.jsonObject = jSONObject;
        this.id = i10;
        this.clickAction = clickAction;
        if (clickAction == ClickAction.URI && str != null && !n.S(str)) {
            this.uri = Uri.parse(str);
        }
        this.text = str2;
        this.backgroundColor = i11;
        this.textColor = i12;
        this.openUriInWebview = z10;
        this.borderColor = i13;
        this.darkTheme = jSONObject2 != null ? new o3(jSONObject2) : null;
    }
}
