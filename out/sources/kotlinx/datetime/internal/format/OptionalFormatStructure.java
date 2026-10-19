package kotlinx.datetime.internal.format;

import A8.A;
import androidx.compose.material.T;
import com.google.android.gms.internal.measurement.M1;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: compiled from: FormatStructure.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class OptionalFormatStructure<T> implements p<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f43864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f43865c;

    /* JADX INFO: compiled from: FormatStructure.kt */
    public static final class a<T, E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b<T, E> f43866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final E f43867b;

        public a() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(b bVar, Object obj) {
            this.f43866a = bVar;
            this.f43867b = obj;
        }
    }

    public OptionalFormatStructure(String onZero, h hVar) {
        kotlin.jvm.internal.i.e(onZero, "onZero");
        this.f43863a = onZero;
        this.f43864b = hVar;
        ListBuilder listBuilderF = M1.f();
        A.b(listBuilderF, hVar);
        ListBuilder listBuilderI = listBuilderF.I();
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(listBuilderI, 10));
        ListIterator listIterator = listBuilderI.listIterator(0);
        while (true) {
            ListBuilder.a aVar = (ListBuilder.a) listIterator;
            if (!aVar.hasNext()) {
                break;
            } else {
                arrayList.add(((k) aVar.next()).c());
            }
        }
        List<m> listO0 = kotlin.collections.q.o0(kotlin.collections.q.r0(arrayList));
        ArrayList arrayList2 = new ArrayList(kotlin.collections.m.y(listO0, 10));
        for (m field : listO0) {
            kotlin.jvm.internal.i.e(field, "field");
            Object objA = field.a();
            if (objA == null) {
                throw new IllegalArgumentException(("The field '" + field.getName() + "' does not define a default value").toString());
            }
            arrayList2.add(new a(field.b(), objA));
        }
        this.f43865c = arrayList2;
    }

    @Override // kotlinx.datetime.internal.format.n
    public final Wa.e<T> a() {
        Wa.e<T> eVarA = this.f43864b.a();
        ArrayList<a> arrayList = this.f43865c;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.m.y(arrayList, 10));
        for (a aVar : arrayList) {
            arrayList2.add(new g(aVar.f43867b, new OptionalFormatStructure$PropertyWithDefault$isDefaultComparisonPredicate$1(1, aVar.f43866a, b.class, "getter", "getter(Ljava/lang/Object;)Ljava/lang/Object;", 0)));
        }
        return new Wa.b(kotlin.collections.l.s(new Pair(new OptionalFormatStructure$formatter$1(1, arrayList2.isEmpty() ? s.f43935a : arrayList2.size() == 1 ? (q) kotlin.collections.q.f0(arrayList2) : new i(arrayList2), q.class, "test", "test(Ljava/lang/Object;)Z", 0), new Wa.c(this.f43863a)), new Pair(new OptionalFormatStructure$formatter$2(1, s.f43935a, s.class, "test", "test(Ljava/lang/Object;)Z", 0), eVarA)));
    }

    @Override // kotlinx.datetime.internal.format.n
    public final kotlinx.datetime.internal.format.parser.l<T> b() {
        EmptyList emptyList = EmptyList.f42983b;
        return new kotlinx.datetime.internal.format.parser.l<>(emptyList, kotlin.collections.l.s(this.f43864b.b(), T.c(kotlin.collections.l.s(new j(this.f43863a).b(), new kotlinx.datetime.internal.format.parser.l(M1.k(new kotlinx.datetime.internal.format.parser.p(new Ia.l<T, p293xa.r>(this) { // from class: kotlinx.datetime.internal.format.OptionalFormatStructure$parser$1
            final /* synthetic */ OptionalFormatStructure<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.this$0 = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v2 boolean
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
                */
            @Override // Ia.l
            public final p293xa.r invoke(java.lang.Object r4) {
                /*
                    r3 = this;
                    kotlinx.datetime.internal.format.OptionalFormatStructure<T> r0 = r3.this$0
                    java.util.ArrayList r0 = r0.f43865c
                    java.util.Iterator r0 = r0.iterator()
                L8:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L1c
                    java.lang.Object r1 = r0.next()
                    kotlinx.datetime.internal.format.OptionalFormatStructure$a r1 = (kotlinx.datetime.internal.format.OptionalFormatStructure.a) r1
                    kotlinx.datetime.internal.format.b<T, E> r2 = r1.f43866a
                    E r1 = r1.f43867b
                    r2.c(r4, r1)
                    goto L8
                L1c:
                    xa.r r4 = p293xa.r.f47939a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.datetime.internal.format.OptionalFormatStructure$parser$1.invoke(java.lang.Object):java.lang.Object");
            }
        })), emptyList)))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OptionalFormatStructure) {
            OptionalFormatStructure optionalFormatStructure = (OptionalFormatStructure) obj;
            if (kotlin.jvm.internal.i.a(this.f43863a, optionalFormatStructure.f43863a) && this.f43864b.equals(optionalFormatStructure.f43864b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f43864b.hashCode() + (this.f43863a.hashCode() * 31);
    }

    public final String toString() {
        return "Optional(" + this.f43863a + ", " + this.f43864b + ')';
    }
}
