package com.android.symphonyhostel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.android.symphonyhostel.model.OutingRequestEntity;


@Repository
public interface OutingRequestRepository  extends JpaRepository<OutingRequestEntity, Long> {

}
