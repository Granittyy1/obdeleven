package androidx.compose.ui.tooling;

import D2.C0692t;
import Na.h;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.text.font.s;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.k;
import kotlin.jvm.internal.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlin.text.m;
import p293xa.d;

/* JADX INFO: compiled from: ComposableInvoker.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@d
public final class a {
    /* JADX WARN: Code duplicated, block: B:31:0x00a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    public static Method a(Method[] methodArr, String str, Class... clsArr) throws NoSuchMethodException {
        Method method;
        ?? r11;
        boolean z10;
        int length = methodArr.length;
        boolean z11 = false;
        int i10 = 0;
        while (i10 < length) {
            method = methodArr[i10];
            if (!i.a(str, method.getName())) {
                if (!m.I(method.getName(), str + '-', z11)) {
                    continue;
                }
                i10++;
                z11 = false;
            }
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?>[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
            if (parameterTypes.length == clsArr2.length) {
                ArrayList arrayList = new ArrayList(parameterTypes.length);
                int length2 = parameterTypes.length;
                boolean z12 = z11;
                ?? r12 = z12;
                while (r11 < length2) {
                    Class<?> cls = parameterTypes[r11];
                    int i11 = r12 + 1;
                    Class<?> cls2 = clsArr2[r12];
                    i.e(cls, "<this>");
                    c cVarA = l.a(cls);
                    i.e(cls2, "<this>");
                    if (cVarA.equals(l.a(cls2)) || cls.isAssignableFrom(cls2)) {
                        r11 = z12;
                        r11 = z12;
                        z10 = true;
                    } else {
                        r11 = z12;
                        z10 = false;
                    }
                    arrayList.add(Boolean.valueOf(z10));
                    r12 = i11;
                    r11++;
                }
                r11 = z12;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    do {
                        if (it.hasNext()) {
                        }
                    } while (((Boolean) it.next()).booleanValue());
                }
                if (method != null) {
                    return method;
                }
                throw new NoSuchMethodException(s.b(str, " not found"));
            }
            continue;
            i10++;
            z11 = false;
        }
        method = null;
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(s.b(str, " not found"));
    }

    public static void b(String str, String str2, InterfaceC1084f interfaceC1084f, Object... objArr) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Method methodA;
        Method method;
        Class<?> cls = Class.forName(str);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        ArrayList arrayList = new ArrayList();
        int length = objArrCopyOf.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Object obj = objArrCopyOf[i10];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i10++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int length2 = clsArr.length;
                int iCeil = length2 == 0 ? 1 : (int) Math.ceil(((double) length2) / 10.0d);
                Class cls3 = Integer.TYPE;
                Na.i iVarJ = Na.l.J(0, iCeil);
                ArrayList arrayList2 = new ArrayList(kotlin.collections.m.y(iVarJ, 10));
                h it = iVarJ.iterator();
                while (it.f4692d) {
                    it.a();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                C0692t c0692t = new C0692t(3);
                ArrayList arrayList3 = (ArrayList) c0692t.f2697b;
                c0692t.b(clsArr);
                arrayList3.add(InterfaceC1084f.class);
                c0692t.b(clsArr2);
                methodA = a(declaredMethods, str2, (Class[]) arrayList3.toArray(new Class[arrayList3.size()]));
            } catch (ReflectiveOperationException unused) {
                methodA = null;
            }
        } catch (ReflectiveOperationException unused2) {
            Method[] declaredMethods2 = cls.getDeclaredMethods();
            int length3 = declaredMethods2.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length3) {
                    method = null;
                    break;
                }
                method = declaredMethods2[i11];
                if (i.a(method.getName(), str2)) {
                    break;
                }
                if (m.I(method.getName(), str2 + '-', false)) {
                    break;
                } else {
                    i11++;
                }
            }
            methodA = method;
        }
        if (methodA != null) {
            methodA.setAccessible(true);
            if (Modifier.isStatic(methodA.getModifiers())) {
                c(methodA, null, interfaceC1084f, Arrays.copyOf(objArr, objArr.length));
                return;
            } else {
                c(methodA, cls.getConstructor(null).newInstance(null), interfaceC1084f, Arrays.copyOf(objArr, objArr.length));
                return;
            }
        }
        throw new NoSuchMethodException("Composable " + str + '.' + str2 + " not found");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:64:0x00e0  */
    public static void c(Method method, Object obj, InterfaceC1084f interfaceC1084f, Object... objArr) throws IllegalAccessException, InvocationTargetException {
        Object objValueOf;
        Class<?>[] parameterTypes = method.getParameterTypes();
        int i10 = -1;
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (i.a(parameterTypes[length], InterfaceC1084f.class)) {
                    i10 = length;
                    break;
                } else if (i11 < 0) {
                    break;
                } else {
                    length = i11;
                }
            }
        }
        int i12 = i10 + 1;
        int iCeil = (i10 == 0 ? 1 : (int) Math.ceil(((double) ((obj != null ? 1 : 0) + i10)) / 10.0d)) + i12;
        int length2 = method.getParameterTypes().length;
        if ((length2 != iCeil ? (int) Math.ceil(((double) i10) / 31.0d) : 0) + iCeil != length2) {
            throw new IllegalStateException("params don't add up to total params");
        }
        Object[] objArr2 = new Object[length2];
        for (int i13 = 0; i13 < length2; i13++) {
            if (i13 < 0 || i13 >= i10) {
                if (i13 == i10) {
                    objValueOf = interfaceC1084f;
                } else if (i12 <= i13 && i13 < iCeil) {
                    objValueOf = 0;
                } else {
                    if (iCeil > i13 || i13 >= length2) {
                        throw new IllegalStateException("Unexpected index");
                    }
                    objValueOf = 2097151;
                }
            } else if (i13 < 0 || i13 > k.S(objArr)) {
                switch (method.getParameterTypes()[i13].getName()) {
                    case "double":
                        objValueOf = Double.valueOf(0.0d);
                        break;
                    case "int":
                        objValueOf = 0;
                        break;
                    case "byte":
                        objValueOf = (byte) 0;
                        break;
                    case "char":
                        objValueOf = (char) 0;
                        break;
                    case "long":
                        objValueOf = 0L;
                        break;
                    case "boolean":
                        objValueOf = Boolean.FALSE;
                        break;
                    case "float":
                        objValueOf = Float.valueOf(0.0f);
                        break;
                    case "short":
                        objValueOf = (short) 0;
                        break;
                    default:
                        objValueOf = null;
                        break;
                }
            } else {
                objValueOf = objArr[i13];
            }
            objArr2[i13] = objValueOf;
        }
        method.invoke(obj, Arrays.copyOf(objArr2, length2));
    }
}
