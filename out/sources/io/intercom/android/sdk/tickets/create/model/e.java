package io.intercom.android.sdk.tickets.create.model;

import Ia.l;
import android.os.Bundle;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f39875c;

    public /* synthetic */ e(int i10, Object obj) {
        this.f39874b = i10;
        this.f39875c = obj;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f39874b) {
            case 0:
                return CreateTicketViewModel.updateCtaState$lambda$14((CreateTicketViewModel) this.f39875c, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj);
            default:
                String argName = (String) obj;
                i.e(argName, "argName");
                Bundle source = (Bundle) this.f39875c;
                i.e(source, "source");
                return Boolean.valueOf(!source.containsKey(argName));
        }
    }
}
