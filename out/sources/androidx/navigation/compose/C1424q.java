package androidx.navigation.compose;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import com.google.android.gms.internal.measurement.Y;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt;
import p141l2.C2749t;

/* JADX INFO: renamed from: androidx.navigation.compose.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1424q implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f19193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f19195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p293xa.e f19196f;

    public /* synthetic */ C1424q(Object obj, Object obj2, p293xa.e eVar, int i10, int i11) {
        this.f19192b = i11;
        this.f19194d = obj;
        this.f19195e = obj2;
        this.f19196f = eVar;
        this.f19193c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19192b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = L4.b.l(this.f19193c | 1);
                C2749t c2749t = (C2749t) this.f19194d;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) this.f19196f;
                Y.c(c2749t, (SaveableStateHolderImpl) this.f19195e, composableLambdaImpl, (InterfaceC1084f) obj, iL);
                return p293xa.r.f47939a;
            default:
                return DatePickerQuestionKt.ComposeTimePickerDialog$lambda$27((Answer) this.f19194d, (Ia.l) this.f19195e, (Ia.a) this.f19196f, this.f19193c, (InterfaceC1084f) obj, ((Integer) obj2).intValue());
        }
    }
}
