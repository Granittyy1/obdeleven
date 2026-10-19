package p037cb;

import Ia.l;
import io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt;

/* JADX INFO: renamed from: cb.i0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1530i0 implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22618c;

    public /* synthetic */ C1530i0(int i10, Object obj) {
        this.f22617b = i10;
        this.f22618c = obj;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f22617b) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                StringBuilder sb2 = new StringBuilder();
                C1536l0 c1536l0 = (C1536l0) this.f22618c;
                sb2.append(c1536l0.f22630e[iIntValue]);
                sb2.append(": ");
                sb2.append(c1536l0.i(iIntValue).a());
                return sb2.toString();
            default:
                return ShortTextQuestionKt.ShortTextQuestion$lambda$7$lambda$6$lambda$4$lambda$3((l) this.f22618c, (String) obj);
        }
    }
}
