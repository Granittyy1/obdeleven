package kotlinx.datetime.internal.format;

import A8.A;
import androidx.compose.material.T;
import com.google.android.gms.internal.measurement.M1;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: compiled from: FormatStructure.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SignedFormatStructure<T> implements p<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f43869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<l<T>> f43870b;

    public SignedFormatStructure(e eVar) {
        this.f43869a = eVar;
        ListBuilder listBuilderF = M1.f();
        A.b(listBuilderF, eVar);
        ListBuilder listBuilderI = listBuilderF.I();
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = listBuilderI.listIterator(0);
        while (true) {
            ListBuilder.a aVar = (ListBuilder.a) listIterator;
            if (!aVar.hasNext()) {
                break;
            }
            l lVarC = ((k) aVar.next()).c().c();
            if (lVarC != null) {
                arrayList.add(lVarC);
            }
        }
        Set<l<T>> setS0 = kotlin.collections.q.s0(arrayList);
        this.f43870b = setS0;
        if (setS0.isEmpty()) {
            throw new IllegalArgumentException("Signed format must contain at least one field with a sign");
        }
    }

    @Override // kotlinx.datetime.internal.format.n
    public final Wa.e<T> a() {
        return new Wa.g(this.f43869a.f43883a.a(), new SignedFormatStructure$formatter$1(this));
    }

    @Override // kotlinx.datetime.internal.format.n
    public final kotlinx.datetime.internal.format.parser.l<T> b() {
        return T.c(kotlin.collections.l.s(new kotlinx.datetime.internal.format.parser.l(M1.k(new kotlinx.datetime.internal.format.parser.o("sign for " + this.f43870b, new Ia.p<T, Boolean, p293xa.r>(this) { // from class: kotlinx.datetime.internal.format.SignedFormatStructure$parser$1
            final /* synthetic */ SignedFormatStructure<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
                this.this$0 = this;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // Ia.p
            public final p293xa.r invoke(Object obj, Boolean bool) {
                boolean zBooleanValue = bool.booleanValue();
                for (l<T> lVar : this.this$0.f43870b) {
                    lVar.a().c(obj, Boolean.valueOf(zBooleanValue != kotlin.jvm.internal.i.a(lVar.a().f43934a.get((Object) obj), Boolean.TRUE)));
                }
                return p293xa.r.f47939a;
            }
        })), EmptyList.f42983b), this.f43869a.f43883a.b()));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SignedFormatStructure) {
            if (this.f43869a.equals(((SignedFormatStructure) obj).f43869a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f43869a.f43883a.hashCode() * 31);
    }

    public final String toString() {
        return "SignedFormatStructure(" + this.f43869a + ')';
    }
}
