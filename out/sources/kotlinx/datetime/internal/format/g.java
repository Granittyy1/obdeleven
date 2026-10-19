package kotlinx.datetime.internal.format;

/* JADX INFO: compiled from: Predicate.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class g<T, E> implements q<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f43886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OptionalFormatStructure$PropertyWithDefault$isDefaultComparisonPredicate$1 f43887b;

    /* JADX WARN: Multi-variable type inference failed */
    public g(Object obj, OptionalFormatStructure$PropertyWithDefault$isDefaultComparisonPredicate$1 optionalFormatStructure$PropertyWithDefault$isDefaultComparisonPredicate$1) {
        this.f43886a = obj;
        this.f43887b = optionalFormatStructure$PropertyWithDefault$isDefaultComparisonPredicate$1;
    }

    @Override // kotlinx.datetime.internal.format.q
    public final boolean a(T t8) {
        return kotlin.jvm.internal.i.a(this.f43887b.invoke(t8), this.f43886a);
    }
}
