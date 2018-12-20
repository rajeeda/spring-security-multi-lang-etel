package com.rajeeda.coopmis.security.model;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "project")
public class Project  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ElementCollection(fetch = FetchType.EAGER)
    @MapKeyColumn(name = "language_id", updatable = false)
    @CollectionTable(name = "project_name", joinColumns = @JoinColumn(name = "project_id"))
    @Column(name = "project_name")
    private Map<String, String> map = new HashMap<String, String>();

    public void setName(final String name, final String language) {
        map.put(language, name);
    }

    public String getName(final String language) {
        return map.get(language);
    }
}