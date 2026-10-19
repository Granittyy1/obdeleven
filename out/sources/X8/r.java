package X8;

import O.e;
import android.content.Intent;
import android.text.TextUtils;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.odx.OdxFactory$Exception;
import com.obdeleven.service.util.b;
import com.parse.ParseException;
import com.parse.ParseQuery;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import com.voltasit.parse.Parse;
import java.util.Arrays;
import p109i8.k;
import p134k8.a2;
import p255u9.C2802e;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7407b;

    public /* synthetic */ r(int i10, Object obj) {
        this.f7406a = i10;
        this.f7407b = obj;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        Object obj = this.f7407b;
        switch (this.f7406a) {
            case 0:
                s sVar = (s) obj;
                sVar.w();
                if (task.isFaulted() && (task.getError() instanceof OdxFactory$Exception)) {
                    O.e.m(task.getError());
                    int iA = ((OdxFactory$Exception) task.getError()).a();
                    if (iA == 0) {
                        sVar.E(R.string.common_check_network_try_again);
                    } else if (iA != 1) {
                        sVar.E(R.string.common_something_went_wrong);
                    } else {
                        sVar.E(R.string.common_description_data_na);
                        sVar.X();
                    }
                    p279w9.b bVar = Application.f29634b;
                    P8.c.a(3, "UDSLongCodingFragment", "popFragment() because loadOdxData task error", Arrays.copyOf(new Object[0], 0));
                    sVar.r().h();
                } else if (task.getResult() == null || !((Boolean) task.getResult()).booleanValue()) {
                    sVar.X();
                } else if (!sVar.f7408A) {
                    sVar.W(false);
                } else if (!sVar.U(false)) {
                    sVar.X();
                }
                return null;
            case 1:
                ((p009a8.b) obj).h(null);
                return null;
            case 2:
                final a2 vehicle = (a2) obj;
                kotlin.jvm.internal.i.e(vehicle, "$vehicle");
                final long jCurrentTimeMillis = System.currentTimeMillis();
                return vehicle.b((short) 1).onSuccess(new Continuation() { // from class: k8.Z1
                    /* JADX WARN: Code duplicated, block: B:19:0x0090  */
                    @Override // com.parse.boltsinternal.Continuation
                    public final Object then(Task task2) throws ParseException {
                        String strB;
                        a2 a2Var = vehicle;
                        ControlUnit controlUnit = (ControlUnit) task2.getResult();
                        long j = jCurrentTimeMillis;
                        if (controlUnit == null) {
                            e.j("Vehicle", "EngineRequestTime.no_cu: " + (System.currentTimeMillis() - j) + "ms");
                            return Boolean.FALSE;
                        }
                        C2802e c2802e = null;
                        if (!controlUnit.G().getResult().booleanValue() || controlUnit.f29327i == ApplicationProtocol.f29262b) {
                            strB = null;
                        } else {
                            k kVar = controlUnit.f29335r;
                            String result = kVar.b("22F1AD").getResult();
                            if (TextUtils.isEmpty(result) || !result.startsWith("62F1AD")) {
                                String result2 = kVar.b("1A97").getResult();
                                if (TextUtils.isEmpty(result2) || !result2.startsWith("5A97")) {
                                    strB = null;
                                } else {
                                    strB = b.b(result2.substring(4));
                                }
                            } else {
                                strB = b.b(result.substring(6));
                            }
                        }
                        try {
                            controlUnit.a().waitForCompletion();
                        } catch (InterruptedException e10) {
                            e.m(e10);
                        }
                        if (!TextUtils.isEmpty(strB)) {
                            try {
                                ParseQuery query = ParseQuery.getQuery(C2802e.class);
                                query.whereEqualTo("engine", strB);
                                c2802e = (C2802e) query.getFirst();
                            } catch (ParseException e11) {
                                if (e11.getCode() == 101) {
                                    c2802e = new C2802e();
                                    c2802e.put("engine", strB);
                                    c2802e.save();
                                }
                            }
                            if (c2802e != null) {
                                a2Var.f42726c.put("engine", c2802e);
                                e.j("Vehicle", "EngineRequestTime.true: " + (System.currentTimeMillis() - j) + "ms");
                                return Boolean.TRUE;
                            }
                        }
                        e.j("Vehicle", "EngineRequestTime.false: " + (System.currentTimeMillis() - j) + "ms");
                        return Boolean.FALSE;
                    }
                });
            case 3:
                com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.q qVar = (com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.q) obj;
                qVar.getClass();
                if (((Boolean) task.getResult()).booleanValue()) {
                    qVar.Y();
                }
                return null;
            case 4:
                return ((com.voltasit.obdeleven.utils.bluetooth.n) obj).g();
            case 5:
                p073f9.b bVar2 = (p073f9.b) obj;
                bVar2.getClass();
                if (task.isFaulted()) {
                    task.getError().printStackTrace();
                } else {
                    bVar2.startActivity(Intent.createChooser((Intent) task.getResult(), "Send chart..."));
                    UserTrackingUtils.c(UserTrackingUtils.Key.f34248I, 1);
                }
                C2134a0.a();
                return null;
            default:
                p170n9.d dVar = (p170n9.d) obj;
                dVar.getClass();
                C2134a0.a();
                Parse.f34395b.i().c(p279w9.a.f47819q);
                UserTrackingUtils.c(UserTrackingUtils.Key.f34264h, 1);
                dVar.getFragmentManager().R();
                return null;
        }
    }
}
