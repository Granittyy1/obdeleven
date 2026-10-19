package bo.app;

import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.JsonUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class h3 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f21173h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f21174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f21175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f21176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f21177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f21178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Integer f21179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Integer f21180g;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    private h3(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
        this.f21174a = num;
        this.f21175b = num2;
        this.f21176c = num3;
        this.f21177d = num4;
        this.f21178e = num5;
        this.f21179f = num6;
        this.f21180g = num7;
    }

    public final Integer a() {
        return this.f21174a;
    }

    public final Integer b() {
        return this.f21176c;
    }

    public final Integer c() {
        return this.f21180g;
    }

    public final Integer d() {
        return this.f21179f;
    }

    public final Integer e() {
        return this.f21178e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3)) {
            return false;
        }
        h3 h3Var = (h3) obj;
        return kotlin.jvm.internal.i.a(this.f21174a, h3Var.f21174a) && kotlin.jvm.internal.i.a(this.f21175b, h3Var.f21175b) && kotlin.jvm.internal.i.a(this.f21176c, h3Var.f21176c) && kotlin.jvm.internal.i.a(this.f21177d, h3Var.f21177d) && kotlin.jvm.internal.i.a(this.f21178e, h3Var.f21178e) && kotlin.jvm.internal.i.a(this.f21179f, h3Var.f21179f) && kotlin.jvm.internal.i.a(this.f21180g, h3Var.f21180g);
    }

    public final Integer f() {
        return this.f21177d;
    }

    public final Integer g() {
        return this.f21175b;
    }

    public int hashCode() {
        Integer num = this.f21174a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f21175b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f21176c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f21177d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f21178e;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f21179f;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f21180g;
        return iHashCode6 + (num7 != null ? num7.hashCode() : 0);
    }

    public String toString() {
        return "InAppMessageTheme(backgroundColor=" + this.f21174a + ", textColor=" + this.f21175b + ", closeButtonColor=" + this.f21176c + ", iconColor=" + this.f21177d + ", iconBackgroundColor=" + this.f21178e + ", headerTextColor=" + this.f21179f + ", frameColor=" + this.f21180g + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h3(JSONObject messageThemeJson) {
        this(JsonUtils.getColorIntegerOrNull(messageThemeJson, InAppMessageBase.BG_COLOR), JsonUtils.getColorIntegerOrNull(messageThemeJson, InAppMessageBase.MESSAGE_TEXT_COLOR), JsonUtils.getColorIntegerOrNull(messageThemeJson, "close_btn_color"), JsonUtils.getColorIntegerOrNull(messageThemeJson, InAppMessageBase.ICON_COLOR), JsonUtils.getColorIntegerOrNull(messageThemeJson, InAppMessageBase.ICON_BG_COLOR), JsonUtils.getColorIntegerOrNull(messageThemeJson, "header_text_color"), JsonUtils.getColorIntegerOrNull(messageThemeJson, "frame_color"));
        kotlin.jvm.internal.i.e(messageThemeJson, "messageThemeJson");
    }
}
