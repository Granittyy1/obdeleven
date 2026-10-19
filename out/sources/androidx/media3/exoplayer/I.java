package androidx.media3.exoplayer;

import android.os.Bundle;
import com.obdeleven.service.model.ControlUnit;
import com.parse.ControlUnitDB;
import com.parse.ParseException;
import com.parse.SaveCallback;
import com.voltasit.obdeleven.presentation.SfdViewModel;
import com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest.UDSOutputTestFragment;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class I implements j1.j.a, p311z4.f, SaveCallback, androidx.fragment.app.E {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17986b;

    public /* synthetic */ I(Object obj) {
        this.f17986b = obj;
    }

    @Override // p311z4.f
    public Object apply(Object obj) {
        ((F3.e) this.f17986b).getClass();
        com.google.firebase.sessions.q.f28736a.getClass();
        String strA = com.google.firebase.sessions.q.f28737b.a((com.google.firebase.sessions.p) obj);
        kotlin.jvm.internal.i.d(strA, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        byte[] bytes = strA.getBytes(kotlin.text.a.f43120b);
        kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // com.parse.ParseCallback1
    public void done(Throwable th) {
        ((ControlUnitDB) this.f17986b).lambda$saveInBackgroundEventually$2((ParseException) th);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, xa.g] */
    @Override // androidx.fragment.app.E
    public void h(Bundle bundle, String str) {
        UDSOutputTestFragment this$0 = (UDSOutputTestFragment) this.f17986b;
        kotlin.jvm.internal.i.e(this$0, "this$0");
        SfdViewModel sfdViewModel = (SfdViewModel) this$0.f31962H.getValue();
        ControlUnit controlUnit = this$0.f31971s;
        kotlin.jvm.internal.i.b(controlUnit);
        String objectId = controlUnit.f29320b.getControlUnitBase().getObjectId();
        kotlin.jvm.internal.i.d(objectId, "getObjectId(...)");
        ControlUnit controlUnit2 = this$0.f31971s;
        kotlin.jvm.internal.i.b(controlUnit2);
        sfdViewModel.d(objectId, controlUnit2.n().shortValue());
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        ((g1.v.c) obj).b((p078g1.F) this.f17986b);
    }
}
