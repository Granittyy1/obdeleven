package Y1;

import Na.l;
import android.os.Bundle;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.j;
import androidx.fragment.app.E;
import androidx.media3.exoplayer.h0;
import com.afollestad.materialdialogs.MaterialDialog;
import com.facebook.FacebookException;
import com.google.gson.internal.f;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.presentation.SfdViewModel;
import com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.q;
import com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h;
import com.voltasit.obdeleven.ui.dialogs.A;
import com.voltasit.obdeleven.ui.dialogs.W;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.i;
import p033c7.H;
import p058e7.x;
import p165n4.v;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements j, j1.j.a, p183oa.d, f, E, MaterialDialog.e, p123ja.f, v.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7563c;

    public /* synthetic */ d(int i10, Object obj) {
        this.f7562b = i10;
        this.f7563c = obj;
    }

    @Override // p183oa.d
    public boolean a(Object obj) {
        long J10;
        long jG;
        CampaignProto$ThickContent campaignProto$ThickContent = (CampaignProto$ThickContent) obj;
        H h8 = (H) this.f7563c;
        if (!h8.f22362k.f22463b) {
            if (!campaignProto$ThickContent.K().equals(CampaignProto$ThickContent.PayloadCase.VANILLA_PAYLOAD)) {
                if (campaignProto$ThickContent.K().equals(CampaignProto$ThickContent.PayloadCase.EXPERIMENTAL_PAYLOAD)) {
                    J10 = campaignProto$ThickContent.I().J();
                    jG = campaignProto$ThickContent.I().G();
                }
                return false;
            }
            J10 = campaignProto$ThickContent.N().J();
            jG = campaignProto$ThickContent.N().G();
            long jA = h8.f22356d.a();
            if (jA <= J10 || jA >= jG) {
                return false;
            }
        }
        return true;
    }

    @Override // n4.v.b
    public void b(Bundle bundle, FacebookException facebookException) {
        p165n4.e this$0 = (p165n4.e) this.f7563c;
        i.e(this$0, "this$0");
        this$0.w(bundle, facebookException);
    }

    @Override // com.afollestad.materialdialogs.MaterialDialog.e
    public void c(MaterialDialog materialDialog) {
        W this$0 = (W) this.f7563c;
        i.e(this$0, "this$0");
        A a10 = this$0.f33856t;
        if (a10 != null) {
            a10.invoke();
        }
        this$0.w("LabelDeveloperAgreementDialog", DialogCallback.CallbackType.f31101b, new Bundle());
    }

    @Override // p123ja.f
    public void d(p123ja.e eVar) {
        ((x) this.f7563c).f34825a.getClass();
    }

    @Override // androidx.compose.ui.graphics.colorspace.j
    public double g(double d10) {
        Rgb rgb = (Rgb) this.f7563c;
        return l.B(rgb.f13550k.g(d10), rgb.f13545e, rgb.f13546f);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, xa.g] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, xa.g] */
    @Override // androidx.fragment.app.E
    public void h(Bundle bundle, String str) {
        switch (this.f7562b) {
            case 5:
                ((SfdViewModel) ((q) this.f7563c).f31843N.getValue()).c();
                break;
            default:
                ((SfdViewModel) ((h) this.f7563c).f31920F.getValue()).c();
                break;
        }
    }

    @Override // com.google.gson.internal.f
    public Object i() {
        Constructor constructor = (Constructor) this.f7563c;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e10) {
            K7.a.AbstractC0062a abstractC0062a = K7.a.f4367a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + K7.a.b(constructor) + "' with no args", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Failed to invoke constructor '" + K7.a.b(constructor) + "' with no args", e12.getCause());
        }
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        ((g1.v.c) obj).e(((h0) this.f7563c).f18423n);
    }
}
