package kotlinx.datetime.internal.format.parser;

import androidx.compose.ui.text.font.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: compiled from: ParserOperation.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class StringSetParserOperation<Output> implements k<Output> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlinx.datetime.internal.format.parser.a<Output, String> f43896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f43898c;

    /* JADX INFO: compiled from: ParserOperation.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Pair<String, a>> f43899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f43900b;

        public a() {
            this(null);
        }

        public a(Object obj) {
            this.f43899a = new ArrayList();
            this.f43900b = false;
        }
    }

    /* JADX INFO: compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return Cb.a.e((String) ((Pair) t8).c(), (String) ((Pair) t10).c());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StringSetParserOperation(Collection<String> strings, kotlinx.datetime.internal.format.parser.a<? super Output, String> setter, String whatThisExpects) {
        kotlin.jvm.internal.i.e(strings, "strings");
        kotlin.jvm.internal.i.e(setter, "setter");
        kotlin.jvm.internal.i.e(whatThisExpects, "whatThisExpects");
        this.f43896a = setter;
        this.f43897b = whatThisExpects;
        this.f43898c = new a(null);
        for (String str : strings) {
            a aVarD = this.f43898c;
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                List<Pair<String, a>> list = aVarD.f43899a;
                final String strValueOf = String.valueOf(cCharAt);
                int iO = kotlin.collections.l.o(0, list.size(), new Ia.l<Pair<? extends String, ? extends a>, Integer>() { // from class: kotlinx.datetime.internal.format.parser.StringSetParserOperation$special$$inlined$binarySearchBy$default$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final Integer invoke(Pair<? extends String, ? extends StringSetParserOperation.a> pair) {
                        return Integer.valueOf(Cb.a.e(pair.c(), strValueOf));
                    }
                }, list);
                List<Pair<String, a>> list2 = aVarD.f43899a;
                if (iO < 0) {
                    a aVar = new a(null);
                    list2.add((-iO) - 1, new Pair<>(String.valueOf(cCharAt), aVar));
                    aVarD = aVar;
                } else {
                    aVarD = list2.get(iO).d();
                }
            }
            aVarD.f43900b = true;
        }
        b(this.f43898c);
    }

    public static final void b(a aVar) {
        Iterator<Pair<String, a>> it = aVar.f43899a.iterator();
        while (it.hasNext()) {
            b(it.next().b());
        }
        ArrayList arrayList = new ArrayList();
        List<Pair<String, a>> list = aVar.f43899a;
        for (Pair<String, a> pair : list) {
            String strA = pair.a();
            a aVarB = pair.b();
            if (!aVarB.f43900b) {
                List<Pair<String, a>> list2 = aVarB.f43899a;
                if (list2.size() == 1) {
                    Pair pair2 = (Pair) kotlin.collections.q.f0(list2);
                    String str = (String) pair2.a();
                    arrayList.add(new Pair(s.b(strA, str), (a) pair2.b()));
                }
            }
            arrayList.add(new Pair(strA, aVarB));
        }
        list.clear();
        list.addAll(kotlin.collections.q.h0(arrayList, new b()));
    }

    @Override // kotlinx.datetime.internal.format.parser.k
    public final Object a(c cVar, final String input, final int i10) {
        String prefix;
        a aVarB;
        int i11;
        kotlin.jvm.internal.i.e(input, "input");
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = i10;
        a aVar = this.f43898c;
        Integer numValueOf = null;
        loop0: while (ref$IntRef.element <= input.length()) {
            if (aVar.f43900b) {
                numValueOf = Integer.valueOf(ref$IntRef.element);
            }
            Iterator<Pair<String, a>> it = aVar.f43899a.iterator();
            do {
                if (!it.hasNext()) {
                    break loop0;
                }
                Pair<String, a> next = it.next();
                prefix = next.a();
                aVarB = next.b();
                i11 = ref$IntRef.element;
                kotlin.jvm.internal.i.e(prefix, "prefix");
            } while (!kotlin.text.m.H(input, prefix, i11, false));
            ref$IntRef.element = prefix.length() + ref$IntRef.element;
            aVar = aVarB;
        }
        if (numValueOf == null) {
            return new h(i10, new Ia.a<String>() { // from class: kotlinx.datetime.internal.format.parser.StringSetParserOperation$consume$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Expected " + this.this$0.f43897b + " but got " + input.subSequence(i10, ref$IntRef.element).toString();
                }
            });
        }
        final String string = input.subSequence(i10, numValueOf.intValue()).toString();
        final kotlinx.datetime.internal.format.parser.a<Output, String> aVar2 = this.f43896a;
        final String strC = aVar2.c(cVar, string);
        return strC == null ? numValueOf : new h(i10, new Ia.a<String>() { // from class: kotlinx.datetime.internal.format.parser.ParserOperationKt$setWithoutReassigning$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                return "Attempting to assign conflicting values '" + strC + "' and '" + string + "' to field '" + aVar2.getName() + '\'';
            }
        });
    }
}
