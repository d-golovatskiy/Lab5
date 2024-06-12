package org.kubsu.tuningmanager.repositories;

import org.kubsu.tuningmanager.entities.AffectingScheme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AffectingSchemeRepository extends JpaRepository<AffectingScheme, Long> {
    List<AffectingScheme> findAffectingSchemeByAffectedId(Long affectedId);
    List<AffectingScheme> findAffectingSchemeByAffectingId(Long affectingId);
    List<AffectingScheme> findAffectingSchemeByAffectedIdAndAffectingId(Long affectedId, Long affectingId);
}
