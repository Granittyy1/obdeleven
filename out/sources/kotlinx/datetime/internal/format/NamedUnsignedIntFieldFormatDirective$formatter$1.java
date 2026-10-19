package kotlinx.datetime.internal.format;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: Add missing generic type declarations: [Target] */
/* JADX INFO: compiled from: FieldFormatDirective.kt */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class NamedUnsignedIntFieldFormatDirective$formatter$1<Target> extends FunctionReferenceImpl implements Ia.l<Target, String> {
    @Override // Ia.l
    public final String invoke(Object obj) {
        NamedUnsignedIntFieldFormatDirective namedUnsignedIntFieldFormatDirective = (NamedUnsignedIntFieldFormatDirective) this.receiver;
        t<Target> tVar = namedUnsignedIntFieldFormatDirective.f43859a;
        int iIntValue = ((Number) tVar.f43936a.b(obj)).intValue();
        String str = (String) kotlin.collections.q.Q(iIntValue - tVar.f43937b, namedUnsignedIntFieldFormatDirective.f43860b);
        return str == null ? Q8.d.a(A8.f.e(iIntValue, "The value ", " of "), tVar.f43939d, " does not have a corresponding string representation") : str;
    }
}
