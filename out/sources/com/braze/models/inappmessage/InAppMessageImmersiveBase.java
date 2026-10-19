package com.braze.models.inappmessage;

import Ia.l;
import android.graphics.Color;
import bo.app.C1471i;
import bo.app.a2;
import bo.app.c2;
import bo.app.f3;
import bo.app.h3;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.support.BrazeLogger;
import com.braze.support.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.collections.EmptyList;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class InAppMessageImmersiveBase extends InAppMessageWithImageBase implements IInAppMessageImmersive {
    private static final String BUTTONS = "btns";
    private static final String CLOSE_BUTTON_COLOR = "close_btn_color";
    public static final a Companion = new a(null);
    private static final String FRAME_COLOR = "frame_color";
    private static final String HEADER = "header";
    private static final String HEADER_TEXT_ALIGN = "text_align_header";
    private static final String HEADER_TEXT_COLOR = "header_text_color";
    private static final String IMAGE_STYLE = "image_style";
    private String buttonIdClicked;
    private int closeButtonColor;
    private Integer frameColor;
    private String header;
    private TextAlign headerTextAlign;
    private int headerTextColor;
    private ImageStyle imageStyle;
    private List<? extends MessageButton> messageButtons;
    private boolean wasButtonClickLogged;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f24189b = new b();

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
        public static final c f24190b = new c();

        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Trigger id not found (this is expected for test sends). Not logging button click.";
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f24191b = new d();

        public d() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Button click already logged for this message. Ignoring.";
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f24192b = new e();

        public e() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cannot log a button click because the BrazeManager is null.";
        }
    }

    public static final class f extends Lambda implements l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONArray f24193b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(JSONArray jSONArray) {
            super(1);
            this.f24193b = jSONArray;
        }

        public final Boolean a(int i10) {
            return Boolean.valueOf(this.f24193b.opt(i10) instanceof JSONObject);
        }

        @Override // Ia.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public static final class g extends Lambda implements l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONArray f24194b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(JSONArray jSONArray) {
            super(1);
            this.f24194b = jSONArray;
        }

        public final Object a(int i10) throws JSONException {
            Object obj = this.f24194b.get(i10);
            if (obj != null) {
                return (JSONObject) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }

        @Override // Ia.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public InAppMessageImmersiveBase() {
        this.headerTextColor = Color.parseColor("#333333");
        this.closeButtonColor = Color.parseColor("#9B9B9B");
        this.messageButtons = EmptyList.f42983b;
        this.imageStyle = ImageStyle.TOP;
        this.headerTextAlign = TextAlign.CENTER;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessageThemeable
    public void enableDarkTheme() {
        super.enableDarkTheme();
        h3 inAppMessageDarkThemeWrapper = getInAppMessageDarkThemeWrapper();
        if (inAppMessageDarkThemeWrapper == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, b.f24189b, 3, (Object) null);
            return;
        }
        if (inAppMessageDarkThemeWrapper.c() != null) {
            setFrameColor(inAppMessageDarkThemeWrapper.c());
        }
        if (inAppMessageDarkThemeWrapper.b() != null) {
            setCloseButtonColor(inAppMessageDarkThemeWrapper.b().intValue());
        }
        if (inAppMessageDarkThemeWrapper.d() != null) {
            setHeaderTextColor(inAppMessageDarkThemeWrapper.d().intValue());
        }
        Iterator<MessageButton> it = getMessageButtons().iterator();
        while (it.hasNext()) {
            it.next().enableDarkTheme();
        }
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public int getCloseButtonColor() {
        return this.closeButtonColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public Integer getFrameColor() {
        return this.frameColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public String getHeader() {
        return this.header;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public TextAlign getHeaderTextAlign() {
        return this.headerTextAlign;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public int getHeaderTextColor() {
        return this.headerTextColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public ImageStyle getImageStyle() {
        return this.imageStyle;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public List<MessageButton> getMessageButtons() {
        return this.messageButtons;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public boolean logButtonClick(MessageButton messageButton) {
        i.e(messageButton, "messageButton");
        c2 brazeManager = getBrazeManager();
        String triggerId = getTriggerId();
        if (triggerId == null || n.S(triggerId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c.f24190b, 3, (Object) null);
            return false;
        }
        if (this.wasButtonClickLogged) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, d.f24191b, 2, (Object) null);
            return false;
        }
        if (brazeManager == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, e.f24192b, 2, (Object) null);
            return false;
        }
        this.buttonIdClicked = messageButton.getStringId();
        a2 a2VarA = C1471i.f21202h.a(triggerId, messageButton);
        if (a2VarA != null) {
            brazeManager.a(a2VarA);
        }
        this.wasButtonClickLogged = true;
        return true;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public void onAfterClosed() {
        String triggerId;
        String str;
        super.onAfterClosed();
        c2 brazeManager = getBrazeManager();
        if (!this.wasButtonClickLogged || (triggerId = getTriggerId()) == null || n.S(triggerId) || (str = this.buttonIdClicked) == null || n.S(str) || brazeManager == null) {
            return;
        }
        brazeManager.a(new f3(getTriggerId(), this.buttonIdClicked));
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setCloseButtonColor(int i10) {
        this.closeButtonColor = i10;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setFrameColor(Integer num) {
        this.frameColor = num;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setHeader(String str) {
        this.header = str;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setHeaderTextAlign(TextAlign textAlign) {
        i.e(textAlign, "<set-?>");
        this.headerTextAlign = textAlign;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setHeaderTextColor(int i10) {
        this.headerTextColor = i10;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setImageStyle(ImageStyle imageStyle) {
        i.e(imageStyle, "<set-?>");
        this.imageStyle = imageStyle;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setMessageButtons(List<? extends MessageButton> list) {
        i.e(list, "<set-?>");
        this.messageButtons = list;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.braze.models.inappmessage.InAppMessageWithImageBase, com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        JSONObject jsonObject = getJsonObject();
        if (jsonObject != null) {
            return jsonObject;
        }
        JSONObject jSONObjectForJsonPut = super.forJsonPut();
        try {
            jSONObjectForJsonPut.putOpt(HEADER, getHeader());
            jSONObjectForJsonPut.put(HEADER_TEXT_COLOR, getHeaderTextColor());
            jSONObjectForJsonPut.put(CLOSE_BUTTON_COLOR, getCloseButtonColor());
            jSONObjectForJsonPut.putOpt(IMAGE_STYLE, getImageStyle().toString());
            jSONObjectForJsonPut.putOpt(HEADER_TEXT_ALIGN, getHeaderTextAlign().toString());
            Integer frameColor = getFrameColor();
            if (frameColor != null) {
                jSONObjectForJsonPut.put(FRAME_COLOR, frameColor.intValue());
            }
            JSONArray jSONArray = new JSONArray();
            Iterator<MessageButton> it = getMessageButtons().iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().forJsonPut());
            }
            jSONObjectForJsonPut.put(BUTTONS, jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObjectForJsonPut;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InAppMessageImmersiveBase(JSONObject jsonObject, c2 brazeManager) {
        ImageStyle imageStyle;
        TextAlign textAlign;
        TextAlign textAlign2;
        TextAlign textAlign3;
        int i10;
        Iterator aVar;
        String upperCase;
        TextAlign[] textAlignArrValues;
        int length;
        int i11;
        String upperCase2;
        TextAlign[] textAlignArrValues2;
        int length2;
        int i12;
        i.e(jsonObject, "jsonObject");
        i.e(brazeManager, "brazeManager");
        String strOptString = jsonObject.optString(HEADER);
        i.d(strOptString, "jsonObject.optString(HEADER)");
        int iOptInt = jsonObject.optInt(HEADER_TEXT_COLOR);
        int iOptInt2 = jsonObject.optInt(CLOSE_BUTTON_COLOR);
        ImageStyle imageStyle2 = ImageStyle.TOP;
        try {
            try {
                try {
                    com.braze.support.c cVar = com.braze.support.c.f24371a;
                    String string = jsonObject.getString(IMAGE_STYLE);
                    i.d(string, "jsonObject.getString(key)");
                    Locale US = Locale.US;
                    i.d(US, "US");
                    String upperCase3 = string.toUpperCase(US);
                    i.d(upperCase3, "this as java.lang.String).toUpperCase(locale)");
                    ImageStyle[] imageStyleArrValues = ImageStyle.values();
                    int length3 = imageStyleArrValues.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 < length3) {
                            imageStyle = imageStyleArrValues[i13];
                            if (i.a(imageStyle.name(), upperCase3)) {
                                break;
                            } else {
                                i13++;
                            }
                        } else {
                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                        }
                    }
                    while (true) {
                        if (i12 < length2) {
                            textAlign2 = textAlignArrValues2[i12];
                            if (i.a(textAlign2.name(), upperCase2)) {
                                break;
                            } else {
                                i12++;
                            }
                        } else {
                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                        }
                    }
                    while (true) {
                        if (i11 < length) {
                            TextAlign textAlign4 = textAlignArrValues[i11];
                            if (i.a(textAlign4.name(), upperCase)) {
                                textAlign3 = textAlign4;
                                break;
                            }
                            i11++;
                        } else {
                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                        }
                    }
                } catch (Exception unused) {
                    imageStyle = imageStyle2;
                }
                com.braze.support.c cVar2 = com.braze.support.c.f24371a;
                String string2 = jsonObject.getString(InAppMessageBase.MESSAGE_TEXT_ALIGN);
                i.d(string2, "jsonObject.getString(key)");
                Locale US2 = Locale.US;
                i.d(US2, "US");
                upperCase = string2.toUpperCase(US2);
                i.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
                textAlignArrValues = TextAlign.values();
                length = textAlignArrValues.length;
                i11 = 0;
            } catch (Exception unused2) {
            }
            com.braze.support.c cVar3 = com.braze.support.c.f24371a;
            String string3 = jsonObject.getString(HEADER_TEXT_ALIGN);
            i.d(string3, "jsonObject.getString(key)");
            Locale US3 = Locale.US;
            i.d(US3, "US");
            upperCase2 = string3.toUpperCase(US3);
            i.d(upperCase2, "this as java.lang.String).toUpperCase(locale)");
            textAlignArrValues2 = TextAlign.values();
            length2 = textAlignArrValues2.length;
            i12 = 0;
        } catch (Exception unused3) {
            textAlign2 = textAlign;
        }
        textAlign = TextAlign.CENTER;
        textAlign3 = TextAlign.CENTER;
        this(jsonObject, brazeManager, strOptString, iOptInt, iOptInt2, imageStyle, textAlign2, textAlign3);
        JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray(BUTTONS);
        JSONArray jSONArrayB = h.b(jsonObject);
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray == null) {
            EmptyList.f42983b.getClass();
            aVar = r.f43021b;
            i10 = 0;
        } else {
            i10 = 0;
            aVar = new kotlin.sequences.n.a(new kotlin.sequences.n(SequencesKt___SequencesKt.C(q.H(Na.l.J(0, jSONArrayOptJSONArray.length())), new f(jSONArrayOptJSONArray)), new g(jSONArrayOptJSONArray)));
        }
        int i14 = i10;
        while (aVar.hasNext()) {
            int i15 = i14 + 1;
            if (i14 >= 0) {
                arrayList.add(new MessageButton((JSONObject) aVar.next(), jSONArrayB.optJSONObject(i14)));
                i14 = i15;
            } else {
                kotlin.collections.l.x();
                throw null;
            }
        }
        setMessageButtons(arrayList);
    }

    private InAppMessageImmersiveBase(JSONObject jSONObject, c2 c2Var, String str, int i10, int i11, ImageStyle imageStyle, TextAlign textAlign, TextAlign textAlign2) {
        super(jSONObject, c2Var);
        this.headerTextColor = Color.parseColor("#333333");
        this.closeButtonColor = Color.parseColor("#9B9B9B");
        this.messageButtons = EmptyList.f42983b;
        this.imageStyle = ImageStyle.TOP;
        this.headerTextAlign = TextAlign.CENTER;
        setHeader(str);
        setHeaderTextColor(i10);
        setCloseButtonColor(i11);
        if (jSONObject.has(FRAME_COLOR)) {
            setFrameColor(Integer.valueOf(jSONObject.optInt(FRAME_COLOR)));
        }
        setImageStyle(imageStyle);
        setHeaderTextAlign(textAlign);
        setMessageTextAlign(textAlign2);
    }
}
