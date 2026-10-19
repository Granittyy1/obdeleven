package retrofit2;

import java.io.EOFException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.InterfaceC2754e;

/* JADX INFO: compiled from: Retrofit.java */
/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap<Method, Object> f46825a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2754e.a f46826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final okhttp3.p f46827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<h.a> f46828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<e.a> f46829e;

    /* JADX INFO: compiled from: Retrofit.java */
    public class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object[] f46830a = new Object[0];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Class f46831b;

        public a(Class cls) {
            this.f46831b = cls;
        }

        /* JADX WARN: Code duplicated, block: B:48:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:53:0x0065 A[SYNTHETIC] */
        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            x xVarB;
            Object obj2;
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f46830a;
            }
            s sVar = r.f46770b;
            boolean zC = sVar.c(method);
            Class cls = this.f46831b;
            if (zC) {
                return sVar.b(cls, obj, method, objArr);
            }
            w wVar = w.this;
            while (true) {
                Object objPutIfAbsent = wVar.f46825a.get(method);
                if (!(objPutIfAbsent instanceof x)) {
                    if (objPutIfAbsent != null) {
                        synchronized (objPutIfAbsent) {
                            obj2 = wVar.f46825a.get(method);
                            if (obj2 == null) {
                                xVarB = (x) obj2;
                                break;
                            }
                        }
                    } else {
                        Object obj3 = new Object();
                        synchronized (obj3) {
                            try {
                                objPutIfAbsent = wVar.f46825a.putIfAbsent(method, obj3);
                                if (objPutIfAbsent != null) {
                                    synchronized (objPutIfAbsent) {
                                        try {
                                            obj2 = wVar.f46825a.get(method);
                                            if (obj2 == null) {
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    xVarB = (x) obj2;
                                    break;
                                }
                                try {
                                    xVarB = x.b(wVar, cls, method);
                                    wVar.f46825a.put(method, xVarB);
                                    break;
                                } catch (Throwable th2) {
                                    wVar.f46825a.remove(method);
                                    throw th2;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                } else {
                    xVarB = (x) objPutIfAbsent;
                    break;
                }
            }
            return xVarB.a(obj, objArr);
        }
    }

    /* JADX INFO: compiled from: Retrofit.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public okhttp3.t f46833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public okhttp3.p f46834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f46835c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList f46836d = new ArrayList();

        public final void a(String str) throws EOFException {
            Objects.requireNonNull(str, "baseUrl == null");
            okhttp3.p.a aVar = new okhttp3.p.a();
            aVar.c(null, str);
            okhttp3.p pVarA = aVar.a();
            ArrayList arrayList = pVarA.f45576f;
            if ("".equals(arrayList.get(arrayList.size() - 1))) {
                this.f46834b = pVarA;
            } else {
                throw new IllegalArgumentException("baseUrl must end in /: " + pVarA);
            }
        }

        public final w b() {
            if (this.f46834b == null) {
                throw new IllegalStateException("Base URL required.");
            }
            okhttp3.t tVar = this.f46833a;
            if (tVar == null) {
                tVar = new okhttp3.t();
            }
            okhttp3.t tVar2 = tVar;
            ExecutorC2787a executorC2787a = r.f46769a;
            c cVar = r.f46771c;
            ArrayList arrayList = new ArrayList(this.f46836d);
            List listA = cVar.a(executorC2787a);
            arrayList.addAll(listA);
            List<? extends h.a> listB = cVar.b();
            int size = listB.size();
            ArrayList arrayList2 = this.f46835c;
            ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1 + size);
            arrayList3.add(new retrofit2.b());
            arrayList3.addAll(arrayList2);
            arrayList3.addAll(listB);
            okhttp3.p pVar = this.f46834b;
            List listUnmodifiableList = Collections.unmodifiableList(arrayList3);
            List listUnmodifiableList2 = Collections.unmodifiableList(arrayList);
            listA.size();
            return new w(tVar2, pVar, listUnmodifiableList, listUnmodifiableList2, executorC2787a);
        }
    }

    public w(InterfaceC2754e.a aVar, okhttp3.p pVar, List list, List list2, ExecutorC2787a executorC2787a) {
        this.f46826b = aVar;
        this.f46827c = pVar;
        this.f46828d = list;
        this.f46829e = list2;
    }

    public final e<?, ?> a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<e.a> list = this.f46829e;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            e<?, ?> eVar = list.get(i10).get(type, annotationArr, this);
            if (eVar != null) {
                return eVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n");
        sb2.append("  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(list.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final <T> T b(Class<T> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<T> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                sb2.append(cls2.getName());
                if (cls2 != cls) {
                    sb2.append(" which is an interface of ");
                    sb2.append(cls.getName());
                }
                throw new IllegalArgumentException(sb2.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    public final <T> h<T, okhttp3.y> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List<h.a> list = this.f46828d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            h<T, okhttp3.y> hVar = (h<T, okhttp3.y>) list.get(i10).a(type, annotationArr, annotationArr2, this);
            if (hVar != null) {
                return hVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(list.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final <T> h<okhttp3.A, T> d(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<h.a> list = this.f46828d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            h<okhttp3.A, T> hVar = (h<okhttp3.A, T>) list.get(i10).b(type, annotationArr, this);
            if (hVar != null) {
                return hVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        sb2.append("  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(list.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final void e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List<h.a> list = this.f46828d;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).getClass();
        }
    }
}
