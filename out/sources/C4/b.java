package C4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.InterfaceC1309y;
import androidx.core.view.n0;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements O1.g.a, p183oa.c, B7.g.a, j1.j.a, InterfaceC1309y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2341b;

    public /* synthetic */ b(int i10) {
        this.f2341b = i10;
    }

    public static int c(long j, int i10, int i11) {
        return (Long.hashCode(j) + i10) * i11;
    }

    public static String d(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static StringBuilder e(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static StringBuilder f(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public static Map h(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    @Override // O1.g.a
    public boolean a(int i10, int i11, int i12, int i13, int i14) {
        return (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) || (i11 == 77 && i12 == 76 && i13 == 76 && (i14 == 84 || i10 == 2));
    }

    @Override // p183oa.c, p311z4.f
    public Object apply(Object obj) {
        switch (this.f2341b) {
            case 5:
                List list = (List) obj;
                Q3.d.I(list, "source is null");
                return new io.reactivex.internal.operators.observable.f(list);
            default:
                CampaignProto$ThickContent campaignProto$ThickContent = (CampaignProto$ThickContent) obj;
                int iOrdinal = campaignProto$ThickContent.G().K().ordinal();
                if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                    return p123ja.h.b(campaignProto$ThickContent);
                }
                Q3.d.B();
                return io.reactivex.internal.operators.maybe.b.f40795b;
        }
    }

    @Override // B7.g.a
    public String b(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        return context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
    }

    @Override // androidx.core.view.InterfaceC1309y
    public n0 g(View v10, n0 n0Var) {
        kotlin.jvm.internal.i.e(v10, "v");
        p222s0.b bVarG = n0Var.f16948a.g(135);
        kotlin.jvm.internal.i.d(bVarG, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = bVarG.f46852b;
        marginLayoutParams.leftMargin = bVarG.f46851a;
        marginLayoutParams.bottomMargin = bVarG.f46854d;
        marginLayoutParams.rightMargin = bVarG.f46853c;
        v10.setLayoutParams(marginLayoutParams);
        return n0.f16947b;
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        ((p162n1.b) obj).getClass();
    }
}
