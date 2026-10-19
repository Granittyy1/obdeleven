package D9;

import io.grpc.MethodDescriptor;

/* JADX INFO: compiled from: Channel.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public abstract String a();

    public abstract <RequestT, ResponseT> b<RequestT, ResponseT> f(MethodDescriptor<RequestT, ResponseT> methodDescriptor, io.grpc.b bVar);
}
