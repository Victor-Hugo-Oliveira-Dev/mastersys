INSERT INTO matricula (aluno_id, dia_vencimento, data_matricula, status) VALUES (1, CURRENT_DATE - INTERVAL 90 DAYS, 10, 'ATIVA');
INSERT INTO matricula (aluno_id, dia_vencimento, data_matricula, status) VALUES (2, CURRENT_DATE - INTERVAL 60 DAYS, 1, 'ATIVA');

INSERT INTO matriculas_modalidades (matricula_id, modalidade_id, plano_id, data_inicio) 

SELECT 
    m.id,
    mo.id,
    p.id,
    CURRENT_DATE - INTERVAL 90 DAYS
FROM matricula m
JOIN modalidade mo ON mo.nome = 'Musculação'
JOIN plano p ON p.nome = 'Mensal'
WHERE m.aluno_id = 2;

INSERT INTO matriculas_modalidades (matricula_id, modalidade_id, graduacao_id, plano_id, data_inicio) 

SELECT 
    m.id,
    mo.id,
    g.id,
    p.id,
    CURRENT_DATE - INTERVAL 60 DAYS
FROM matricula m
JOIN modalidade mo ON mo.nome = 'Jiu-Jitsu'
JOIN graduacao g ON g.nome = 'Branca'
JOIN plano p ON p.nome = 'Mensal'
WHERE m.aluno_id = 3;

INSERT INTO faturas_matricula (matricula_id, valor, data_vencimento, data_pagamento, status) 
INSERT INTO faturas_matricula (matricula_id, valor, data_vencimento, data_pagamento, status) 
INSERT INTO faturas_matricula (matricula_id, valor, data_vencimento, data_pagamento, status) 

SELECT 
    m.id,
    p.valor,
    CURRENT_DATE - INTERVAL 60 DAYS,
    120.00,
    CURRENT_DATE - INTERVAL 58 DAYS,
    'PAGA'
FROM matricula m
JOIN plano p ON p.nome = 'Mensal'
JOIN generate_series(1, 3) AS n ON true
WHERE m.aluno_id = 3;
