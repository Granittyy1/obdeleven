package p109i8;

import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.protocol.Protocol;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: RequestProvider.java */
/* JADX INFO: loaded from: classes3.dex */
public interface k {
    void a(ApplicationProtocol applicationProtocol);

    Task<String> b(String str);

    void c(Protocol protocol);

    Task<String> d(String str);
}
