package kotlinx.datetime.internal.format;

import com.google.android.gms.internal.measurement.M1;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlinx.datetime.internal.format.parser.StringSetParserOperation;

/* JADX INFO: compiled from: FieldFormatDirective.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class StringFieldFormatDirective<Target> implements k<Target> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f43874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<String> f43875b;

    public StringFieldFormatDirective(o field, Set set) {
        kotlin.jvm.internal.i.e(field, "field");
        this.f43874a = field;
        this.f43875b = set;
        if (set.isEmpty()) {
            throw new IllegalArgumentException("The set of accepted strings is empty");
        }
    }

    @Override // kotlinx.datetime.internal.format.k
    public final Wa.e<Target> a() {
        return new Wa.j(new StringFieldFormatDirective$formatter$1(1, this.f43874a.f43891a, b.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0));
    }

    @Override // kotlinx.datetime.internal.format.k
    public final kotlinx.datetime.internal.format.parser.l<Target> b() {
        Set<String> set = this.f43875b;
        o oVar = this.f43874a;
        return new kotlinx.datetime.internal.format.parser.l<>(M1.k(new StringSetParserOperation(set, oVar.f43891a, oVar.f43892b)), EmptyList.f42983b);
    }

    @Override // kotlinx.datetime.internal.format.k
    public final m<Target, String> c() {
        return this.f43874a;
    }
}
