package S6;

import android.os.Bundle;
import androidx.fragment.app.E;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import com.voltasit.obdeleven.presentation.SfdViewModel;
import com.voltasit.obdeleven.presentation.controlUnit.eeprom.EepromFragment;
import p033c7.C1502o;
import p033c7.C1506t;
import p078g1.A;
import p078g1.v;
import p083g7.o;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements p183oa.b, j1.j.a, p063f.b, E {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5676c;

    public /* synthetic */ i(int i10, Object obj) {
        this.f5675b = i10;
        this.f5676c = obj;
    }

    @Override // p183oa.b
    public void a(Object obj) {
        switch (this.f5675b) {
            case 0:
                o oVar = (o) obj;
                j jVar = (j) this.f5676c;
                U6.a aVar = jVar.f5680d;
                if (aVar != null) {
                    p083g7.h hVar = oVar.f35638a;
                    C1502o c1502o = jVar.f5677a;
                    aVar.displayMessage(hVar, new C1506t(c1502o.f22476a, c1502o.f22477b, c1502o.f22478c, c1502o.f22479d, c1502o.f22480e, c1502o.f22481f, c1502o.f22482g, hVar, oVar.f35639b));
                }
                break;
            default:
                CampaignProto$ThickContent campaignProto$ThickContent = (CampaignProto$ThickContent) this.f5676c;
                if (campaignProto$ThickContent.K().equals(CampaignProto$ThickContent.PayloadCase.VANILLA_PAYLOAD)) {
                    campaignProto$ThickContent.N().I();
                    Q3.d.C();
                } else if (campaignProto$ThickContent.K().equals(CampaignProto$ThickContent.PayloadCase.EXPERIMENTAL_PAYLOAD)) {
                    campaignProto$ThickContent.I().I();
                    Q3.d.C();
                }
                break;
        }
    }

    @Override // p063f.b
    public void b(Object obj) {
        Ia.l tmp0 = (Ia.l) this.f5676c;
        kotlin.jvm.internal.i.e(tmp0, "$tmp0");
        tmp0.invoke((p063f.a) obj);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, xa.g] */
    @Override // androidx.fragment.app.E
    public void h(Bundle bundle, String str) {
        EepromFragment this$0 = (EepromFragment) this.f5676c;
        kotlin.jvm.internal.i.e(this$0, "this$0");
        ((SfdViewModel) this$0.f31553z.getValue()).c();
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        ((v.c) obj).V((A) this.f5676c);
    }
}
