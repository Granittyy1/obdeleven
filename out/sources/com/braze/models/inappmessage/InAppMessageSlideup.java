package com.braze.models.inappmessage;

import android.graphics.Color;
import bo.app.c2;
import bo.app.h3;
import com.braze.enums.inappmessage.CropType;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.SlideFrom;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class InAppMessageSlideup extends InAppMessageWithImageBase {
    private static final String CHEVRON_COLOR = "close_btn_color";
    public static final Companion Companion = new Companion(null);
    private static final String SLIDE_FROM = "slide_from";
    private int chevronColor;
    private SlideFrom slideFrom;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f24195b = new a();

        public a() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cannot apply dark theme with a null themes wrapper";
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f24196b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error creating JSON.";
        }
    }

    public InAppMessageSlideup() {
        this.slideFrom = SlideFrom.BOTTOM;
        this.chevronColor = Color.parseColor("#9B9B9B");
        setMessageTextAlign(TextAlign.START);
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessageThemeable
    public void enableDarkTheme() {
        super.enableDarkTheme();
        h3 inAppMessageDarkThemeWrapper = getInAppMessageDarkThemeWrapper();
        if (inAppMessageDarkThemeWrapper == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.D, (Throwable) null, a.f24195b, 2, (Object) null);
            return;
        }
        Integer numB = inAppMessageDarkThemeWrapper.b();
        if ((numB != null && numB.intValue() == -1) || inAppMessageDarkThemeWrapper.b() == null) {
            return;
        }
        this.chevronColor = inAppMessageDarkThemeWrapper.b().intValue();
    }

    public final int getChevronColor() {
        return this.chevronColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public MessageType getMessageType() {
        return MessageType.SLIDEUP;
    }

    public final SlideFrom getSlideFrom() {
        return this.slideFrom;
    }

    public final void setChevronColor(int i10) {
        this.chevronColor = i10;
    }

    public final void setSlideFrom(SlideFrom slideFrom) {
        i.e(slideFrom, "<set-?>");
        this.slideFrom = slideFrom;
    }

    @Override // com.braze.models.inappmessage.InAppMessageWithImageBase, com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        JSONObject jsonObject = getJsonObject();
        if (jsonObject != null) {
            return jsonObject;
        }
        JSONObject jSONObjectForJsonPut = super.forJsonPut();
        try {
            jSONObjectForJsonPut.put(SLIDE_FROM, this.slideFrom.toString());
            jSONObjectForJsonPut.put(CHEVRON_COLOR, this.chevronColor);
            jSONObjectForJsonPut.put("type", getMessageType().name());
        } catch (JSONException e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, b.f24196b);
        }
        return jSONObjectForJsonPut;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppMessageSlideup(JSONObject jsonObject, c2 brazeManager) {
        this(jsonObject, brazeManager, (SlideFrom) JsonUtils.optEnum(jsonObject, SLIDE_FROM, SlideFrom.class, SlideFrom.BOTTOM), jsonObject.optInt(CHEVRON_COLOR));
        i.e(jsonObject, "jsonObject");
        i.e(brazeManager, "brazeManager");
    }

    private InAppMessageSlideup(JSONObject jSONObject, c2 c2Var, SlideFrom slideFrom, int i10) {
        super(jSONObject, c2Var);
        this.slideFrom = SlideFrom.BOTTOM;
        this.chevronColor = Color.parseColor("#9B9B9B");
        if (slideFrom != null) {
            this.slideFrom = slideFrom;
        }
        this.chevronColor = i10;
        setCropType((CropType) JsonUtils.optEnum(jSONObject, InAppMessageBase.CROP_TYPE, CropType.class, CropType.FIT_CENTER));
        setMessageTextAlign((TextAlign) JsonUtils.optEnum(jSONObject, InAppMessageBase.MESSAGE_TEXT_ALIGN, TextAlign.class, TextAlign.START));
    }
}
