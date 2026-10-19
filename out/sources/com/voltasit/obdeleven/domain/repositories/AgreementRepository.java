package com.voltasit.obdeleven.domain.repositories;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: AgreementRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface AgreementRepository {

    /* JADX INFO: compiled from: AgreementRepository.kt */
    public static final class AgreementNotFound extends Exception {
        public AgreementNotFound() {
            super("Agreement not found");
        }
    }

    Object i(int i10, ContinuationImpl continuationImpl);

    Object j(List list, ContinuationImpl continuationImpl);
}
