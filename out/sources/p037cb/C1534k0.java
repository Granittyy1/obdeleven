package p037cb;

import Ia.a;
import Ya.b;
import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import java.util.ArrayList;

/* JADX INFO: renamed from: cb.k0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1534k0 implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22625c;

    public /* synthetic */ C1534k0(int i10, Object obj) {
        this.f22624b = i10;
        this.f22625c = obj;
    }

    @Override // Ia.a
    public final Object invoke() {
        ArrayList arrayList;
        b<?>[] bVarArrTypeParametersSerializers;
        switch (this.f22624b) {
            case 0:
                D<?> d10 = ((C1536l0) this.f22625c).f22627b;
                if (d10 == null || (bVarArrTypeParametersSerializers = d10.typeParametersSerializers()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(bVarArrTypeParametersSerializers.length);
                    for (b<?> bVar : bVarArrTypeParametersSerializers) {
                        arrayList.add(bVar.getDescriptor());
                    }
                }
                return C1528h0.b(arrayList);
            default:
                return ConversationScreenKt.ConversationScreen$lambda$26((ConversationViewModel) this.f22625c);
        }
    }
}
