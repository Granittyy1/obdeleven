package com.voltasit.obdeleven.ui.dialogs;

import io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class A implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f33730c;

    public /* synthetic */ A(int i10, Object obj) {
        this.f33729b = i10;
        this.f33730c = obj;
    }

    @Override // Ia.a
    public final Object invoke() {
        switch (this.f33729b) {
            case 0:
                ((B) this.f33730c).a();
                return null;
            case 1:
                return DatePickerQuestionKt.TimePicker$lambda$22$lambda$21((androidx.compose.runtime.X) this.f33730c);
            default:
                String str = ((p141l2.z) this.f33730c).f44327a;
                return Boolean.valueOf(str != null && p141l2.z.f44326r.e(str));
        }
    }
}
