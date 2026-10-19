package bo.app;

import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.JsonUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class o3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f21694d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f21695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f21696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f21697c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    private o3(Integer num, Integer num2, Integer num3) {
        this.f21695a = num;
        this.f21696b = num2;
        this.f21697c = num3;
    }

    public final Integer a() {
        return this.f21695a;
    }

    public final Integer b() {
        return this.f21697c;
    }

    public final Integer c() {
        return this.f21696b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj;
        return kotlin.jvm.internal.i.a(this.f21695a, o3Var.f21695a) && kotlin.jvm.internal.i.a(this.f21696b, o3Var.f21696b) && kotlin.jvm.internal.i.a(this.f21697c, o3Var.f21697c);
    }

    public int hashCode() {
        Integer num = this.f21695a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f21696b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f21697c;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        return "MessageButtonTheme(backgroundColor=" + this.f21695a + ", textColor=" + this.f21696b + ", borderColor=" + this.f21697c + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o3(JSONObject buttonThemeJson) {
        this(JsonUtils.getColorIntegerOrNull(buttonThemeJson, InAppMessageBase.BG_COLOR), JsonUtils.getColorIntegerOrNull(buttonThemeJson, InAppMessageBase.MESSAGE_TEXT_COLOR), JsonUtils.getColorIntegerOrNull(buttonThemeJson, "border_color"));
        kotlin.jvm.internal.i.e(buttonThemeJson, "buttonThemeJson");
    }
}
