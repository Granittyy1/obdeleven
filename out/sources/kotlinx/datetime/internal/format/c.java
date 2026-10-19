package kotlinx.datetime.internal.format;

import com.google.android.gms.internal.measurement.M1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: compiled from: FormatStructure.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class c<T> implements p<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f43880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f43881b;

    public c(h hVar, ArrayList arrayList) {
        this.f43880a = hVar;
        this.f43881b = arrayList;
    }

    @Override // kotlinx.datetime.internal.format.n
    public final Wa.e<T> a() {
        return this.f43880a.a();
    }

    @Override // kotlinx.datetime.internal.format.n
    public final kotlinx.datetime.internal.format.parser.l<T> b() {
        EmptyList emptyList = EmptyList.f42983b;
        ListBuilder listBuilderF = M1.f();
        listBuilderF.add(this.f43880a.b());
        Iterator it = this.f43881b.iterator();
        while (it.hasNext()) {
            listBuilderF.add(((n) it.next()).b());
        }
        return new kotlinx.datetime.internal.format.parser.l<>(emptyList, listBuilderF.I());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f43880a.equals(cVar.f43880a) && this.f43881b.equals(cVar.f43881b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f43881b.hashCode() + (this.f43880a.hashCode() * 31);
    }

    public final String toString() {
        return "AlternativesParsing(" + this.f43881b + ')';
    }
}
