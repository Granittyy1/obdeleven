package kotlin.reflect;

import Ia.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class TypesJVMKt$typeToString$unwrap$1 extends FunctionReferenceImpl implements l<Class<?>, Class<?>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TypesJVMKt$typeToString$unwrap$1 f43077b = new TypesJVMKt$typeToString$unwrap$1();

    public TypesJVMKt$typeToString$unwrap$1() {
        super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
    }

    @Override // Ia.l
    public final Class<?> invoke(Class<?> cls) {
        Class<?> p10 = cls;
        i.e(p10, "p0");
        return p10.getComponentType();
    }
}
