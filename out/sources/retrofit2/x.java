package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import java.util.regex.Pattern;
import okhttp3.InterfaceC2754e;

/* JADX INFO: compiled from: ServiceMethod.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class x<T> {
    /* JADX WARN: Code duplicated, block: B:391:0x08e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:392:0x08e9  */
    /* JADX WARN: Code duplicated, block: B:577:0x0902 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v67 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static k b(w wVar, Class cls, Method method) {
        Type genericReturnType;
        boolean z10;
        boolean zI;
        boolean z11;
        Annotation[][] annotationArr;
        int i10;
        int i11;
        String str;
        q<?>[] qVarArr;
        boolean z12;
        q<?> qVar;
        String str2;
        q<?>[] qVarArr2;
        boolean z13;
        q<?> oVar;
        q<?> aVar;
        q<?> pVar;
        q<?> pVar2;
        int i12;
        int i13 = -1;
        int i14 = 0;
        boolean z14 = true;
        u.a aVar2 = new u.a(wVar, cls, method);
        Annotation[] annotationArr2 = aVar2.f46802d;
        int length = annotationArr2.length;
        int i15 = 0;
        while (true) {
            Method method2 = aVar2.f46801c;
            String str3 = "HEAD";
            if (i15 >= length) {
                if (aVar2.f46812o == null) {
                    throw A.j(method2, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!aVar2.f46813p) {
                    if (aVar2.f46815r) {
                        throw A.j(method2, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (aVar2.f46814q) {
                        throw A.j(method2, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr3 = aVar2.f46803e;
                int length2 = annotationArr3.length;
                aVar2.f46820w = new q[length2];
                int i16 = length2 - 1;
                int i17 = 0;
                while (i17 < length2) {
                    q<?>[] qVarArr3 = aVar2.f46820w;
                    Type type = aVar2.f46804f[i17];
                    Annotation[] annotationArr4 = annotationArr3[i17];
                    boolean z15 = i17 == i16 ? z14 : false;
                    if (annotationArr4 != null) {
                        int length3 = annotationArr4.length;
                        int i18 = 0;
                        qVar = null;
                        while (true) {
                            annotationArr = annotationArr3;
                            if (i18 >= length3) {
                                i10 = length2;
                                i11 = i16;
                                str = str3;
                                qVarArr = qVarArr3;
                                z12 = z15;
                                break;
                            }
                            Annotation annotation = annotationArr4[i18];
                            int i19 = length2;
                            int i20 = i16;
                            int i21 = length3;
                            if (annotation instanceof gc.y) {
                                aVar2.c(i17, type);
                                if (aVar2.f46811n) {
                                    throw A.k(method2, i17, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (aVar2.j) {
                                    throw A.k(method2, i17, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (aVar2.f46808k) {
                                    throw A.k(method2, i17, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (aVar2.f46809l) {
                                    throw A.k(method2, i17, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (aVar2.f46810m) {
                                    throw A.k(method2, i17, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (aVar2.f46816s != null) {
                                    throw A.k(method2, i17, "@Url cannot be used with @%s URL", aVar2.f46812o);
                                }
                                aVar2.f46811n = true;
                                if (type != okhttp3.p.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                    throw A.k(method2, i17, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                oVar = new q.n(method2, i17);
                                str2 = str3;
                            } else {
                                boolean z16 = annotation instanceof gc.s;
                                str2 = str3;
                                w wVar2 = aVar2.f46799a;
                                if (z16) {
                                    aVar2.c(i17, type);
                                    if (aVar2.f46808k) {
                                        throw A.k(method2, i17, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (aVar2.f46809l) {
                                        throw A.k(method2, i17, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (aVar2.f46810m) {
                                        throw A.k(method2, i17, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (aVar2.f46811n) {
                                        throw A.k(method2, i17, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (aVar2.f46816s == null) {
                                        throw A.k(method2, i17, "@Path can only be used with relative url on @%s", aVar2.f46812o);
                                    }
                                    aVar2.j = true;
                                    gc.s sVar = (gc.s) annotation;
                                    String strValue = sVar.value();
                                    if (!u.a.f46798z.matcher(strValue).matches()) {
                                        throw A.k(method2, i17, "@Path parameter name must match %s. Found: %s", u.a.f46797y.pattern(), strValue);
                                    }
                                    if (!aVar2.f46819v.contains(strValue)) {
                                        throw A.k(method2, i17, "URL \"%s\" does not contain \"{%s}\".", aVar2.f46816s, strValue);
                                    }
                                    wVar2.e(type, annotationArr4);
                                    oVar = new q.i(method2, i17, strValue, sVar.encoded());
                                } else if (annotation instanceof gc.t) {
                                    aVar2.c(i17, type);
                                    gc.t tVar = (gc.t) annotation;
                                    String strValue2 = tVar.value();
                                    boolean zEncoded = tVar.encoded();
                                    Class<?> clsE = A.e(type);
                                    qVarArr2 = qVarArr3;
                                    aVar2.f46808k = true;
                                    if (!Iterable.class.isAssignableFrom(clsE)) {
                                        if (clsE.isArray()) {
                                            wVar2.e(u.a.a(clsE.getComponentType()), annotationArr4);
                                            pVar2 = new p(new q.j(strValue2, zEncoded));
                                        } else {
                                            wVar2.e(type, annotationArr4);
                                            oVar = new q.j<>(strValue2, zEncoded);
                                        }
                                        i18 = i18;
                                        z13 = z15;
                                    } else {
                                        if (!(type instanceof ParameterizedType)) {
                                            throw A.k(method2, i17, clsE.getSimpleName() + " must include generic type (e.g., " + clsE.getSimpleName() + "<String>)", new Object[0]);
                                        }
                                        wVar2.e(A.d(0, (ParameterizedType) type), annotationArr4);
                                        pVar2 = new o(new q.j(strValue2, zEncoded));
                                    }
                                    oVar = pVar2;
                                    i18 = i18;
                                    z13 = z15;
                                } else {
                                    qVarArr2 = qVarArr3;
                                    if (annotation instanceof gc.v) {
                                        aVar2.c(i17, type);
                                        boolean zEncoded2 = ((gc.v) annotation).encoded();
                                        Class<?> clsE2 = A.e(type);
                                        aVar2.f46809l = true;
                                        if (!Iterable.class.isAssignableFrom(clsE2)) {
                                            if (clsE2.isArray()) {
                                                wVar2.e(u.a.a(clsE2.getComponentType()), annotationArr4);
                                                pVar2 = new p(new q.l(zEncoded2));
                                            } else {
                                                wVar2.e(type, annotationArr4);
                                                oVar = new q.l<>(zEncoded2);
                                            }
                                            i18 = i18;
                                            z13 = z15;
                                        } else {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw A.k(method2, i17, clsE2.getSimpleName() + " must include generic type (e.g., " + clsE2.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            wVar2.e(A.d(0, (ParameterizedType) type), annotationArr4);
                                            pVar2 = new o(new q.l(zEncoded2));
                                        }
                                        oVar = pVar2;
                                        i18 = i18;
                                        z13 = z15;
                                    } else {
                                        z13 = z15;
                                        if (annotation instanceof gc.u) {
                                            aVar2.c(i17, type);
                                            Class<?> clsE3 = A.e(type);
                                            aVar2.f46810m = true;
                                            if (!Map.class.isAssignableFrom(clsE3)) {
                                                throw A.k(method2, i17, "@QueryMap parameter type must be Map.", new Object[0]);
                                            }
                                            Type typeF = A.f(type, clsE3);
                                            if (!(typeF instanceof ParameterizedType)) {
                                                throw A.k(method2, i17, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                            ParameterizedType parameterizedType = (ParameterizedType) typeF;
                                            Type typeD = A.d(0, parameterizedType);
                                            if (String.class != typeD) {
                                                throw A.k(method2, i17, "@QueryMap keys must be of type String: " + typeD, new Object[0]);
                                            }
                                            wVar2.e(A.d(1, parameterizedType), annotationArr4);
                                            oVar = new q.k<>(method2, i17, ((gc.u) annotation).encoded());
                                        } else if (annotation instanceof gc.i) {
                                            aVar2.c(i17, type);
                                            gc.i iVar = (gc.i) annotation;
                                            String strValue3 = iVar.value();
                                            Class<?> clsE4 = A.e(type);
                                            if (Iterable.class.isAssignableFrom(clsE4)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw A.k(method2, i17, clsE4.getSimpleName() + " must include generic type (e.g., " + clsE4.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                wVar2.e(A.d(0, (ParameterizedType) type), annotationArr4);
                                                pVar = new o(new q.d(strValue3, iVar.allowUnsafeNonAsciiValues()));
                                            } else if (clsE4.isArray()) {
                                                wVar2.e(u.a.a(clsE4.getComponentType()), annotationArr4);
                                                pVar = new p(new q.d(strValue3, iVar.allowUnsafeNonAsciiValues()));
                                            } else {
                                                wVar2.e(type, annotationArr4);
                                                oVar = new q.d<>(strValue3, iVar.allowUnsafeNonAsciiValues());
                                            }
                                            oVar = pVar;
                                        } else if (annotation instanceof gc.j) {
                                            if (type == okhttp3.o.class) {
                                                oVar = new q.f(method2, i17);
                                            } else {
                                                aVar2.c(i17, type);
                                                Class<?> clsE5 = A.e(type);
                                                if (!Map.class.isAssignableFrom(clsE5)) {
                                                    throw A.k(method2, i17, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                                                }
                                                Type typeF2 = A.f(type, clsE5);
                                                if (!(typeF2 instanceof ParameterizedType)) {
                                                    throw A.k(method2, i17, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType2 = (ParameterizedType) typeF2;
                                                Type typeD2 = A.d(0, parameterizedType2);
                                                if (String.class != typeD2) {
                                                    throw A.k(method2, i17, "@HeaderMap keys must be of type String: " + typeD2, new Object[0]);
                                                }
                                                wVar2.e(A.d(1, parameterizedType2), annotationArr4);
                                                oVar = new q.e<>(method2, i17, ((gc.j) annotation).allowUnsafeNonAsciiValues());
                                            }
                                        } else if (annotation instanceof gc.c) {
                                            aVar2.c(i17, type);
                                            if (!aVar2.f46814q) {
                                                throw A.k(method2, i17, "@Field parameters can only be used with form encoding.", new Object[0]);
                                            }
                                            gc.c cVar = (gc.c) annotation;
                                            String strValue4 = cVar.value();
                                            boolean zEncoded3 = cVar.encoded();
                                            aVar2.f46805g = true;
                                            Class<?> clsE6 = A.e(type);
                                            if (Iterable.class.isAssignableFrom(clsE6)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw A.k(method2, i17, clsE6.getSimpleName() + " must include generic type (e.g., " + clsE6.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                wVar2.e(A.d(0, (ParameterizedType) type), annotationArr4);
                                                pVar = new o(new q.b(strValue4, zEncoded3));
                                            } else if (clsE6.isArray()) {
                                                wVar2.e(u.a.a(clsE6.getComponentType()), annotationArr4);
                                                pVar = new p(new q.b(strValue4, zEncoded3));
                                            } else {
                                                wVar2.e(type, annotationArr4);
                                                oVar = new q.b<>(strValue4, zEncoded3);
                                            }
                                            oVar = pVar;
                                        } else if (annotation instanceof gc.d) {
                                            aVar2.c(i17, type);
                                            if (!aVar2.f46814q) {
                                                throw A.k(method2, i17, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                            }
                                            Class<?> clsE7 = A.e(type);
                                            if (!Map.class.isAssignableFrom(clsE7)) {
                                                throw A.k(method2, i17, "@FieldMap parameter type must be Map.", new Object[0]);
                                            }
                                            Type typeF3 = A.f(type, clsE7);
                                            if (!(typeF3 instanceof ParameterizedType)) {
                                                throw A.k(method2, i17, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                            ParameterizedType parameterizedType3 = (ParameterizedType) typeF3;
                                            Type typeD3 = A.d(0, parameterizedType3);
                                            if (String.class != typeD3) {
                                                throw A.k(method2, i17, "@FieldMap keys must be of type String: " + typeD3, new Object[0]);
                                            }
                                            wVar2.e(A.d(1, parameterizedType3), annotationArr4);
                                            aVar2.f46805g = true;
                                            oVar = new q.c<>(method2, i17, ((gc.d) annotation).encoded());
                                        } else {
                                            i18 = i18;
                                            if (annotation instanceof gc.q) {
                                                aVar2.c(i17, type);
                                                if (!aVar2.f46815r) {
                                                    throw A.k(method2, i17, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                gc.q qVar2 = (gc.q) annotation;
                                                aVar2.f46806h = true;
                                                String strValue5 = qVar2.value();
                                                Class<?> clsE8 = A.e(type);
                                                if (strValue5.isEmpty()) {
                                                    boolean zIsAssignableFrom = Iterable.class.isAssignableFrom(clsE8);
                                                    q.m mVar = q.m.f46765a;
                                                    if (zIsAssignableFrom) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw A.k(method2, i17, clsE8.getSimpleName() + " must include generic type (e.g., " + clsE8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        if (!okhttp3.s.c.class.isAssignableFrom(A.e(A.d(0, (ParameterizedType) type)))) {
                                                            throw A.k(method2, i17, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        oVar = new o(mVar);
                                                    } else if (clsE8.isArray()) {
                                                        if (!okhttp3.s.c.class.isAssignableFrom(clsE8.getComponentType())) {
                                                            throw A.k(method2, i17, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        oVar = new p(mVar);
                                                    } else {
                                                        if (!okhttp3.s.c.class.isAssignableFrom(clsE8)) {
                                                            throw A.k(method2, i17, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        oVar = mVar;
                                                    }
                                                } else {
                                                    okhttp3.o oVarC = okhttp3.o.b.c("Content-Disposition", androidx.compose.foundation.gestures.d.b("form-data; name=\"", strValue5, "\""), "Content-Transfer-Encoding", qVar2.encoding());
                                                    if (Iterable.class.isAssignableFrom(clsE8)) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw A.k(method2, i17, clsE8.getSimpleName() + " must include generic type (e.g., " + clsE8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        Type typeD4 = A.d(0, (ParameterizedType) type);
                                                        if (okhttp3.s.c.class.isAssignableFrom(A.e(typeD4))) {
                                                            throw A.k(method2, i17, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        oVar = new o(new q.g(method2, i17, oVarC, wVar2.c(typeD4, annotationArr4, annotationArr2)));
                                                    } else if (clsE8.isArray()) {
                                                        Class<?> clsA = u.a.a(clsE8.getComponentType());
                                                        if (okhttp3.s.c.class.isAssignableFrom(clsA)) {
                                                            throw A.k(method2, i17, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        oVar = new p(new q.g(method2, i17, oVarC, wVar2.c(clsA, annotationArr4, annotationArr2)));
                                                    } else {
                                                        if (okhttp3.s.c.class.isAssignableFrom(clsE8)) {
                                                            throw A.k(method2, i17, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        oVar = new q.g(method2, i17, oVarC, wVar2.c(type, annotationArr4, annotationArr2));
                                                    }
                                                }
                                            } else {
                                                if (annotation instanceof gc.r) {
                                                    aVar2.c(i17, type);
                                                    if (!aVar2.f46815r) {
                                                        throw A.k(method2, i17, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                    }
                                                    aVar2.f46806h = true;
                                                    Class<?> clsE9 = A.e(type);
                                                    if (!Map.class.isAssignableFrom(clsE9)) {
                                                        throw A.k(method2, i17, "@PartMap parameter type must be Map.", new Object[0]);
                                                    }
                                                    Type typeF4 = A.f(type, clsE9);
                                                    if (!(typeF4 instanceof ParameterizedType)) {
                                                        throw A.k(method2, i17, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType4 = (ParameterizedType) typeF4;
                                                    Type typeD5 = A.d(0, parameterizedType4);
                                                    if (String.class != typeD5) {
                                                        throw A.k(method2, i17, "@PartMap keys must be of type String: " + typeD5, new Object[0]);
                                                    }
                                                    Type typeD6 = A.d(1, parameterizedType4);
                                                    if (okhttp3.s.c.class.isAssignableFrom(A.e(typeD6))) {
                                                        throw A.k(method2, i17, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                    }
                                                    aVar = new q.h<>(method2, i17, wVar2.c(typeD6, annotationArr4, annotationArr2), ((gc.r) annotation).encoding());
                                                } else if (annotation instanceof gc.a) {
                                                    aVar2.c(i17, type);
                                                    if (aVar2.f46814q || aVar2.f46815r) {
                                                        throw A.k(method2, i17, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                    }
                                                    if (aVar2.f46807i) {
                                                        throw A.k(method2, i17, "Multiple @Body method annotations found.", new Object[0]);
                                                    }
                                                    try {
                                                        h<T, okhttp3.y> hVarC = wVar2.c(type, annotationArr4, annotationArr2);
                                                        aVar2.f46807i = true;
                                                        aVar = new q.a<>(method2, i17, hVarC);
                                                    } catch (RuntimeException e10) {
                                                        throw A.l(method2, e10, i17, "Unable to create @Body converter for %s", type);
                                                    }
                                                } else if (annotation instanceof gc.x) {
                                                    aVar2.c(i17, type);
                                                    Class<?> clsE10 = A.e(type);
                                                    for (int i22 = i17 - 1; i22 >= 0; i22--) {
                                                        q<?> qVar3 = aVar2.f46820w[i22];
                                                        if ((qVar3 instanceof q.o) && ((q.o) qVar3).f46768a.equals(clsE10)) {
                                                            throw A.k(method2, i17, "@Tag type " + clsE10.getName() + " is duplicate of " + r.f46770b.a(method2, i22) + " and would always overwrite its value.", new Object[0]);
                                                        }
                                                    }
                                                    oVar = new q.o(clsE10);
                                                } else {
                                                    oVar = null;
                                                }
                                                oVar = aVar;
                                            }
                                        }
                                        i18 = i18;
                                    }
                                }
                                if (oVar != null) {
                                    if (qVar == null) {
                                        throw A.k(method2, i17, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                    }
                                    qVar = oVar;
                                }
                                i18++;
                                annotationArr3 = annotationArr;
                                length2 = i19;
                                i16 = i20;
                                length3 = i21;
                                str3 = str2;
                                qVarArr3 = qVarArr2;
                                z15 = z13;
                            }
                            qVarArr2 = qVarArr3;
                            z13 = z15;
                            if (oVar != null) {
                                if (qVar == null) {
                                    throw A.k(method2, i17, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                }
                                qVar = oVar;
                            }
                            i18++;
                            annotationArr3 = annotationArr;
                            length2 = i19;
                            i16 = i20;
                            length3 = i21;
                            str3 = str2;
                            qVarArr3 = qVarArr2;
                            z15 = z13;
                        }
                    } else {
                        annotationArr = annotationArr3;
                        i10 = length2;
                        i11 = i16;
                        str = str3;
                        qVarArr = qVarArr3;
                        z12 = z15;
                        qVar = null;
                    }
                    if (qVar == null) {
                        if (z12) {
                            try {
                                if (A.e(type) == kotlin.coroutines.c.class) {
                                    aVar2.f46821x = true;
                                    qVar = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw A.k(method2, i17, "No Retrofit annotation found.", new Object[0]);
                    }
                    qVarArr[i17] = qVar;
                    i17++;
                    z14 = true;
                    annotationArr3 = annotationArr;
                    length2 = i10;
                    i16 = i11;
                    str3 = str;
                }
                String str4 = str3;
                if (aVar2.f46816s == null && !aVar2.f46811n) {
                    throw A.j(method2, null, "Missing either @%s URL or @Url parameter.", aVar2.f46812o);
                }
                boolean z17 = aVar2.f46814q;
                if (!z17 && !aVar2.f46815r && !aVar2.f46813p && aVar2.f46807i) {
                    throw A.j(method2, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z17 && !aVar2.f46805g) {
                    throw A.j(method2, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (aVar2.f46815r && !aVar2.f46806h) {
                    throw A.j(method2, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                u uVar = new u(aVar2);
                Type genericReturnType2 = method.getGenericReturnType();
                if (A.g(genericReturnType2)) {
                    throw A.j(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw A.j(method, null, "Service methods cannot return void.", new Object[0]);
                }
                Annotation[] annotations = method.getAnnotations();
                boolean z18 = uVar.f46796l;
                if (z18) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    Type typeD7 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                    if (typeD7 instanceof WildcardType) {
                        typeD7 = ((WildcardType) typeD7).getLowerBounds()[0];
                    }
                    if (A.e(typeD7) == v.class && (typeD7 instanceof ParameterizedType)) {
                        typeD7 = A.d(0, (ParameterizedType) typeD7);
                        zI = false;
                        z11 = true;
                    } else {
                        if (A.e(typeD7) == d.class) {
                            throw A.j(method, null, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", A.d(0, (ParameterizedType) typeD7));
                        }
                        zI = A.i(typeD7);
                        z11 = false;
                    }
                    genericReturnType = new A.b(null, d.class, typeD7);
                    if (!A.h(annotations, y.class)) {
                        Annotation[] annotationArr5 = new Annotation[annotations.length + 1];
                        annotationArr5[0] = z.f46837a;
                        System.arraycopy(annotations, 0, annotationArr5, 1, annotations.length);
                        annotations = annotationArr5;
                    }
                    z10 = z11;
                } else {
                    genericReturnType = method.getGenericReturnType();
                    z10 = false;
                    zI = false;
                }
                try {
                    e<?, ?> eVarA = wVar.a(genericReturnType, annotations);
                    Type typeResponseType = eVarA.responseType();
                    if (typeResponseType == okhttp3.z.class) {
                        throw A.j(method, null, "'" + A.e(typeResponseType).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (typeResponseType == v.class) {
                        throw A.j(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (uVar.f46789d.equals(str4) && !Void.class.equals(typeResponseType) && !A.i(typeResponseType)) {
                        throw A.j(method, null, "HEAD method must use Void or Unit as response type.", new Object[0]);
                    }
                    try {
                        h hVarD = wVar.d(typeResponseType, method.getAnnotations());
                        InterfaceC2754e.a aVar3 = wVar.f46826b;
                        if (z18) {
                            return z10 ? new k.c(uVar, aVar3, hVarD, eVarA) : new k.b(uVar, aVar3, hVarD, eVarA, zI);
                        }
                        return new k.a(uVar, aVar3, hVarD, eVarA);
                    } catch (RuntimeException e11) {
                        throw A.j(method, e11, "Unable to create converter for %s", typeResponseType);
                    }
                } catch (RuntimeException e12) {
                    throw A.j(method, e12, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr2[i15];
            if (annotation2 instanceof gc.b) {
                aVar2.b("DELETE", ((gc.b) annotation2).value(), i14);
            } else if (annotation2 instanceof gc.f) {
                aVar2.b("GET", ((gc.f) annotation2).value(), i14);
            } else if (annotation2 instanceof gc.g) {
                aVar2.b("HEAD", ((gc.g) annotation2).value(), i14);
            } else if (annotation2 instanceof gc.n) {
                aVar2.b("PATCH", ((gc.n) annotation2).value(), true);
            } else if (annotation2 instanceof gc.o) {
                aVar2.b("POST", ((gc.o) annotation2).value(), true);
            } else if (annotation2 instanceof gc.p) {
                aVar2.b("PUT", ((gc.p) annotation2).value(), true);
            } else if (annotation2 instanceof gc.m) {
                aVar2.b("OPTIONS", ((gc.m) annotation2).value(), i14);
            } else {
                if (annotation2 instanceof gc.h) {
                    gc.h hVar = (gc.h) annotation2;
                    aVar2.b(hVar.method(), hVar.path(), hVar.hasBody());
                } else if (annotation2 instanceof gc.k) {
                    gc.k kVar = (gc.k) annotation2;
                    String[] strArrValue = kVar.value();
                    if (strArrValue.length == 0) {
                        throw A.j(method2, null, "@Headers annotation is empty.", new Object[i14]);
                    }
                    boolean zAllowUnsafeNonAsciiValues = kVar.allowUnsafeNonAsciiValues();
                    okhttp3.o.a aVar4 = new okhttp3.o.a();
                    int length4 = strArrValue.length;
                    for (int i23 = i14; i23 < length4; i23++) {
                        String str5 = strArrValue[i23];
                        int iIndexOf = str5.indexOf(58);
                        if (iIndexOf == i13 || iIndexOf == 0 || iIndexOf == str5.length() - 1) {
                            throw A.j(method2, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str5);
                        }
                        int i24 = length;
                        String strSubstring = str5.substring(0, iIndexOf);
                        String strTrim = str5.substring(iIndexOf + 1).trim();
                        if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                            try {
                                Pattern pattern = okhttp3.r.f45588d;
                                aVar2.f46818u = okhttp3.r.a.a(strTrim);
                            } catch (IllegalArgumentException e13) {
                                throw A.j(method2, e13, "Malformed content type: %s", strTrim);
                            }
                        } else if (zAllowUnsafeNonAsciiValues) {
                            aVar4.d(strSubstring, strTrim);
                        } else {
                            aVar4.a(strSubstring, strTrim);
                        }
                        length = i24;
                        i13 = -1;
                    }
                    i12 = length;
                    aVar2.f46817t = aVar4.e();
                } else {
                    i12 = length;
                    if (annotation2 instanceof gc.l) {
                        if (aVar2.f46814q) {
                            throw A.j(method2, null, "Only one encoding annotation is allowed.", new Object[0]);
                        }
                        aVar2.f46815r = true;
                    } else if (!(annotation2 instanceof gc.e)) {
                        continue;
                    } else {
                        if (aVar2.f46815r) {
                            throw A.j(method2, null, "Only one encoding annotation is allowed.", new Object[0]);
                        }
                        aVar2.f46814q = true;
                    }
                }
                i15++;
                length = i12;
                i13 = -1;
                i14 = 0;
            }
            i12 = length;
            i15++;
            length = i12;
            i13 = -1;
            i14 = 0;
        }
    }

    public abstract T a(Object obj, Object[] objArr);
}
