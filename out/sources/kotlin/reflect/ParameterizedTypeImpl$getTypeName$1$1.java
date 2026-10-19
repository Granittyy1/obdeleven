package kotlin.reflect;

import Ia.l;
import java.lang.reflect.Type;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class ParameterizedTypeImpl$getTypeName$1$1 extends FunctionReferenceImpl implements l<Type, String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ParameterizedTypeImpl$getTypeName$1$1 f43076b = new ParameterizedTypeImpl$getTypeName$1$1();

    public ParameterizedTypeImpl$getTypeName$1$1() {
        super(1, a.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
    }

    @Override // Ia.l
    public final String invoke(Type type) {
        Type p10 = type;
        i.e(p10, "p0");
        return a.a(p10);
    }
}
