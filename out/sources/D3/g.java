package D3;

import android.util.Log;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.GlideException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: DecodePath.java */
/* JADX INFO: loaded from: classes.dex */
public final class g<DataType, ResourceType, Transcode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<DataType> f2741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<? extends A3.e<DataType, ResourceType>> f2742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final P3.e<ResourceType, Transcode> f2743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Y3.a.c f2744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2745e;

    public g(Class cls, Class cls2, Class cls3, List list, P3.e eVar, Y3.a.c cVar) {
        this.f2741a = cls;
        this.f2742b = list;
        this.f2743c = eVar;
        this.f2744d = cVar;
        this.f2745e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final o a(int i10, int i11, A3.d dVar, B3.e eVar, DecodeJob.a aVar) throws GlideException {
        o oVarB;
        A3.g gVar;
        EncodeStrategy encodeStrategyG;
        boolean z10;
        boolean z11;
        A3.b dVar2;
        Y3.a.c cVar = this.f2744d;
        List<Throwable> list = (List) cVar.a();
        try {
            o<ResourceType> oVarB2 = b(eVar, i10, i11, dVar, list);
            cVar.b(list);
            DecodeJob decodeJob = DecodeJob.this;
            decodeJob.getClass();
            Class<?> cls = oVarB2.get().getClass();
            DataSource dataSource = DataSource.f24514e;
            DataSource dataSource2 = aVar.f24567a;
            f<R> fVar = decodeJob.f24532b;
            A3.f fVar2 = null;
            if (dataSource2 != dataSource) {
                A3.g gVarE = fVar.e((Class<Z>) cls);
                gVar = gVarE;
                oVarB = gVarE.b(decodeJob.f24539i, oVarB2, decodeJob.f24542m, decodeJob.f24543n);
            } else {
                oVarB = oVarB2;
                gVar = null;
            }
            if (!oVarB2.equals(oVarB)) {
                oVarB2.a();
            }
            if (fVar.f2726c.f24479b.f24463d.a(oVarB.c()) != null) {
                Registry registry = fVar.f2726c.f24479b;
                registry.getClass();
                A3.f fVarA = registry.f24463d.a(oVarB.c());
                if (fVarA == null) {
                    throw new Registry.NoResultEncoderAvailableException(oVarB.c());
                }
                encodeStrategyG = fVarA.g(decodeJob.f24545p);
                fVar2 = fVarA;
            } else {
                encodeStrategyG = EncodeStrategy.f24523d;
            }
            A3.b bVar = decodeJob.f24552w;
            ArrayList arrayListB = fVar.b();
            int size = arrayListB.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    z10 = false;
                    break;
                }
                if (((H3.q.a) arrayListB.get(i12)).f3667a.equals(bVar)) {
                    z10 = true;
                    break;
                }
                i12++;
            }
            Object obj = oVarB;
            if (decodeJob.f24544o.d(!z10, dataSource2, encodeStrategyG)) {
                if (fVar2 == null) {
                    throw new Registry.NoResultEncoderAvailableException(oVarB.get().getClass());
                }
                int iOrdinal = encodeStrategyG.ordinal();
                if (iOrdinal == 0) {
                    z11 = false;
                    dVar2 = new d(decodeJob.f24552w, decodeJob.j);
                } else {
                    if (iOrdinal != 1) {
                        throw new IllegalArgumentException("Unknown strategy: " + encodeStrategyG);
                    }
                    z11 = false;
                    dVar2 = new p(fVar.f2726c.f24478a, decodeJob.f24552w, decodeJob.j, decodeJob.f24542m, decodeJob.f24543n, gVar, cls, decodeJob.f24545p);
                }
                n<Z> nVar = (n) n.f2769f.a();
                nVar.f2773e = z11;
                nVar.f2772d = 1;
                nVar.f2771c = oVarB;
                DecodeJob.b<?> bVar2 = decodeJob.f24537g;
                bVar2.f24569a = dVar2;
                bVar2.f24570b = fVar2;
                bVar2.f24571c = nVar;
                obj = nVar;
            }
            return this.f2743c.b(obj, dVar);
        } catch (Throwable th) {
            cVar.b(list);
            throw th;
        }
    }

    public final o<ResourceType> b(B3.e<DataType> eVar, int i10, int i11, A3.d dVar, List<Throwable> list) throws GlideException {
        List<? extends A3.e<DataType, ResourceType>> list2 = this.f2742b;
        int size = list2.size();
        o<ResourceType> oVarB = null;
        for (int i12 = 0; i12 < size; i12++) {
            A3.e<DataType, ResourceType> eVar2 = list2.get(i12);
            try {
                if (eVar2.a(eVar.a(), dVar)) {
                    oVarB = eVar2.b(eVar.a(), i10, i11, dVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(eVar2);
                }
                list.add(e10);
            }
            if (oVarB != null) {
                break;
            }
        }
        if (oVarB != null) {
            return oVarB;
        }
        throw new GlideException(this.f2745e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f2741a + ", decoders=" + this.f2742b + ", transcoder=" + this.f2743c + '}';
    }
}
